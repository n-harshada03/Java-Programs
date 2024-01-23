package Java_apna_college.Stacks;
import java.util.Stack;

public class rev_Stack {
    public static void pushAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(s, data);
        s.push(top);


    }
    public static void reverseString(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverseString(s);
        pushAtBottom(s, top);

    }
    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        reverseString(s);
        while(!s.isEmpty()){
            
            System.out.println(s.pop());
        }
    }
}
