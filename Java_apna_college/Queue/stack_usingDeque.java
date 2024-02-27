package Java_apna_college.Queue;

import java.util.*;

public class stack_usingDeque {
    public class Stack{
        Deque<Integer> deque=new LinkedList<>();

        public void push(int data){
            deque.addLast(data);
        }
        public int pop(){
            return deque.removeLast();
        }
        public int peek(){
            return deque.getLast();
        }


    }

    public static void main(String[] args) {
        stack_usingDeque sd=new stack_usingDeque();
        Stack s=sd.new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.pop();
        System.out.println(s.peek());

    }
    
}
