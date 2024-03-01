package Java_apna_college.Heaps;
import java.util.*;

public class PriorityQueue_jcf {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(1);
        pq.add(4);
        pq.add(2);
        pq.add(7);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }

    }
    
}
