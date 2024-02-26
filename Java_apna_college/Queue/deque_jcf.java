package Java_apna_college.Queue;

import java.util.*;

public class deque_jcf {
    public static void main(String[] args) {
        Deque<Integer> d=new LinkedList<>();
        d.addFirst(1);
        d.addLast(2);
        d.addLast(3);
        d.addFirst(4);
        d.removeFirst();
        d.removeLast();
        System.out.println(d);
        System.out.println(d.getLast());

    }
    
}
