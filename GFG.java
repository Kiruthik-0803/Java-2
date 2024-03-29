import java.util.HashMap;
 
public class GFG {
 
    public static void main(String[] args)
    {
        
        HashMap<String, Integer> map = new HashMap<>();
 
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);
        Integer a =Integer.valueOf(100);
        Integer b =Integer.valueOf(200);
        System.out.println(a + " " + b);
 
        System.out.println("Size of map is:- "+ map.size());
 s
        System.out.println(map);
 
        if (map.containsKey("vishal")) {
 
            Integer c = map.get("vishal");
 
            System.out.println("value for key"
                               + " \"vishal\" is:- " + c);
        }
    }
} 
