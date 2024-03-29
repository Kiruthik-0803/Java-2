import java.util.*;

public class ex1 {
    public static void main(String[] args) {
    ArrayList<Integer> c = new ArrayList<Integer>();
        c.add(1);
        c.add(3);
        c.add(5);
        c.add(7);
        c.add(9);
        Iterator<Integer>ix=c.iterator();
        while(ix.hasNext()){
            System.out.println(ix.next());
        }
        for(Integer i:c){
            if(i==7){
                c.remove(Integer.valueOf(7));
            }
           

        }
        System.out.println(c);
    }
}
