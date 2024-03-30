package Java_apna_college.Heaps;
//takes time but easy approach

public class longest_prefix_suffix {
    String lps(String s) {
        int n= s.length();
        String longest="";

        for(int i=0; i<n; i++){
            String prefix=s.substring(0,i);
            String sufix= s.substring(n-i);
            
            if(prefix.equals(sufix)){
                longest=prefix;
            }
            
        }

        return longest;
    }
    
}
