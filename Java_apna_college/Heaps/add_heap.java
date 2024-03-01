package Java_apna_college.Heaps;

import java.util.ArrayList;

public class add_heap {
    public class heap{
        ArrayList<Integer> arr=new ArrayList<>();
        int child=arr.size()-1;
        int parent=(2*child-1)/2;
        
        public void add(int data){
            arr.add(data);
            while(arr.get(child)<arr.get(parent)){
                //swap
                int temp=arr.get(child);
                arr.set(child,arr.get(parent));
                arr.set(parent,temp);
            }

        }
        public int peek(){
            return arr.get(0);
        }
    }

    public static void main(String[] args) {
        
    }
    
}
