package Java_apna_college.Stacks;

import java.util.Stack;

public class parenthesis {

public static boolean  validParenthesis(String str ){
    Stack<Character> s=new Stack<>();
    //push all opening brackets 
    for (int i=0;i<str.length();i++){
        char ch = str.charAt(i);

//push all opening brackets 
        if(ch=='(' || ch== '{' || ch== '['){
            s.push(ch);
        }
        else{
            if(s.isEmpty()){
                return false ;
            }
            if((s.peek()=='(' || ch==')') || (s.peek()=='{' || ch=='}') || (s.peek()=='[' || ch==']')){
                s.pop();
            }
            else{
                return false;
            }
        }
    }
    if(s.isEmpty()){
        return true;
    }
    else {
        return false;
    }

}

    public static void main(String args[]){
        String str ="[((}))]";
        System.out.println(validParenthesis(str)); 
    }
    
}
