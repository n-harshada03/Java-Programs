package Java_apna_college.Stacks;

import java.util.Stack;

public class next_Greater {

    public static long[] nextLargerElement(long[] arr, int n)
    { 
        Stack<Integer> s= new Stack<>();
        long nextGArr[]=new long[n];

        for(int i=n-1;i>=0;i--){
            //1
            while(!s.isEmpty() && arr[i]>arr[s.peek()]){
                s.pop();
            }
            //2
            if(s.isEmpty()){
                nextGArr[i]=-1;
            }
            else{
                nextGArr[i]=arr[s.peek()];
            }
            
            s.push(i);

        }
        for(int i=0;i<nextGArr.length;i++){
            System.out.println(nextGArr[i]+" ");
        }
        return nextGArr;
    } 
    public static void main(String[] args) {
        long arr[]={6,8,0,1,3};
        int n=arr.length;
        nextLargerElement(arr, n);

        
    }
    
}
