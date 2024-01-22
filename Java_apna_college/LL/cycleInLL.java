public class cycleInLL {
    public static Node head;
    public static Node tail;

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false; // Moved outside the while loop
    }

    public static void removeCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break;
            }
        }

        if (slow != fast) {
            return; // No cycle found
        }

        // To remove the cycle
        slow = head;
        while (slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }

        // Break the cycle
        fast.next = null;
    }

    public static void main(String args[]) {
        head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        head.next = second;
        second.next = third;
        third.next = head; // Creating a cycle

        System.out.println(isCycle()); // Output: true
        removeCycle();
        System.out.println(isCycle()); // Output: false
    }
}
