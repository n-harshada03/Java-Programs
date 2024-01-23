package Java_apna_college.Stacks;
import java.util.*;
//java collection framework
public class jcf_stack {
    
    public static void main(String args[]){
        Stack<Integer> s=new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        



    }
}
