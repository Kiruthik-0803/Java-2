import java.util.*; 

public class LinkedList { 
    
    // Main driver method 
    public static void main(String[] args) 
    {  
        Set<String> hash_Set = new HashSet<String>(); 
        hash_Set.add("Geeks"); 
        hash_Set.add("Geeks");  
        hash_Set.add("Geeks"); 
        hash_Set.add("Geeks"); 
        hash_Set.add("Set"); 
        hash_Set.remove("Set"); 
        System.out.println(hash_Set.contains("Geeks"));
       System.out.println( hash_Set.size());
        System.out.println(hash_Set);
    } 
}