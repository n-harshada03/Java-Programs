package Java_apna_college.Stacks;

import java.util.Stack;

public class reverse_String {

    public static String revString(String str){
        
        // elements from the string and push them into stack
        Stack<Character> s= new Stack<>();
        int i=0;
        while(i<str.length()){

            s.push(str.charAt(i));
            i++;

        }

        //store into string
        StringBuilder sb= new StringBuilder("");
        while(!s.isEmpty()){
            char curr=s.pop();
            sb.append(curr);
        }

        str=sb.toString();

        return str;

    }


    public static void main(String[] args) {
        String str="abc";
        System.out.println(revString(str));

    }
    
}
