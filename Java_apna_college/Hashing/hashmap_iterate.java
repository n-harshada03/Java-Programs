package Java_apna_college.Hashing;
import java.util.*;

public class hashmap_iterate {
    public static void main(String[] args) {
        HashMap<String, Integer> hm=new HashMap<>();
        hm.put("India",100);
        hm.put("Us", 50);
        hm.put("Russia", 150);
        hm.put("China", 350);

        //Iterate
        Set<String> s=hm.keySet();

        for(String keys:s){
            System.out.println("key= " + keys + "," +"value= "+hm.get(keys));
        }

        
    }
    
}
