package Java_apna_college.Stacks;

import java.util.ArrayList;

public class arrList_stack {

    public  class Stack{
        ArrayList<Integer> list=new ArrayList<>();

        //isempty
        public Boolean isEmpty(){
            return list.size()==0;
        }

        //push
        public void push(int data){
            list.add(data);
        }

        //pop
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top =list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //peek
        public int peek(){
            return list.get(list.size()-1);
        }


    }
    
    public static void main(String[] args) {
        arrList_stack as=new arrList_stack();
        Stack s= as.new Stack();

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
