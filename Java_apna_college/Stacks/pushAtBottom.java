package Java_apna_college.Stacks;

import java.util.Stack;
//recursion O(N)
public class pushAtBottom {

    public static void pushatBot(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        
        int top =s.pop();
        pushatBot(s, data);
        s.push(top);

    }

    public static void main(String args[]){
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushatBot(s,4);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }

    
}
