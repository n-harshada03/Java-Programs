public class palindrome_or_not {

    public static Node head;
    public static Node tail;

    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data ;
            this.next=null;
        }
    }

    public void addFirst(int data){
        Node newNode=new Node(data);
        
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addLast(int data){
        Node newNode =new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=null;
        tail=newNode;
    }

    public void add(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public void printList(){
        if(head==null){
            System.out.println("Null");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        
        }
        System.out.print("Null");
    }

    //slow-Fast approach
    public Node findMidNode(Node head){
        Node slow =head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;  //++;
            fast=fast.next.next; //+2;
        }
        return slow;
    }
    public boolean checkPalindrome(){
        if (head==null || head.next==null){
            return true;
        }
        //step 1 find mid 
        Node midNode=findMidNode(head);

        //step-2 reverse 2nd half
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right =prev;//right half head

        //Step 3check left half and right half
        while (right!=null) {
            if(left.data!=right.data){
                return false;
            }
            left =left.next;
            right=right.next;
        }
        return true;
    }

    public static void main(String args[]){
        palindrome_or_not ll=new palindrome_or_not();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        // ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.printList();
        System.out.println();
        System.out.println(ll.checkPalindrome());

    }
}
