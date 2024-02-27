package Java_apna_college.Queue;
import java.util.*;

public class queue_usingDeque {
    public class Queue{
        Deque<Integer> deque=new LinkedList<>();

        public void add(int data){
            deque.addLast(data);
        }
        public int remove(){
            return deque.removeFirst();
        }
        public int peek(){
            return deque.getFirst();
        }


    }

    public static void main(String[] args) {
        queue_usingDeque qd=new queue_usingDeque();
        Queue q=qd.new Queue();
        q.add(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.remove();
        System.out.println(q.peek());

    }
    
}
