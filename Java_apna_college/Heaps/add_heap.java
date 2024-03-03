package Java_apna_college.Heaps;

import java.util.ArrayList;

public class add_heap {
    public class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            arr.add(data);
            int child = arr.size() - 1;
            int parent = (child - 1) / 2;

            while (child > 0 && arr.get(child) < arr.get(parent)) {
                // Swap
                int temp = arr.get(child);
                arr.set(child, arr.get(parent));
                arr.set(parent, temp);

                child = parent;
                parent = (child - 1) / 2;
            }
        }

        public int peek() {
            return arr.get(0);
        }

        private void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minIdx = i;

            if (left < arr.size() && arr.get(minIdx) > arr.get(left)) {
                minIdx = left;
            }

            if (right < arr.size() && arr.get(minIdx) > arr.get(right)) {
                minIdx = right;
            }

            if (minIdx != i) {
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);
                heapify(minIdx);
            }
        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }

        public int remove() {
            if (arr.isEmpty()) {
                throw new IllegalStateException("Heap is empty");
            }

            int val = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.remove(arr.size() - 1);
            heapify(0);
            return val;
        }
    }

    public static void main(String[] args) {
        add_heap h = new add_heap();
        Heap H = h.new Heap();
        H.add(3);
        H.add(4);
        H.add(1);
        H.add(5);

        while (!H.isEmpty()) {
            System.out.println(H.peek());
            H.remove();
        }
    }
}
