package Java_apna_college.Hashing;
import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm=new HashMap<>();

        //insert O(1)
        hm.put("Japan", 200);
        hm.put("India", 150);
        hm.put("China",200);

        System.out.println(hm);

        //get   O(1)
        int population= hm.get("India");
        System.out.println(population);

        //containsKey    O(1)
        System.out.println(hm.containsKey("Indonesia"));
        System.out.println(hm.containsKey("India"));

        //remove      O(1)
        System.out.println(hm.remove("Indonesia"));
        System.out.println(hm.remove("China"));
        System.out.println(hm);

        //size
        System.out.println(hm.size());

        //isEmpty
        System.out.println("Empty?" + hm.isEmpty());

        //clear
        hm.clear();

        
        System.out.println(hm);
    }
    
}
