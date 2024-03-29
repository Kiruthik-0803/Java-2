import java.util.*;

public class Collections {
    @SuppressWarnings("removal")
    public static void main(String[] args) {
        ArrayList<Integer> c = new ArrayList<Integer>();
        Collection<Integer> i=new Vector<>() ;

        c.add(1);
        c.add(2);
        c.add(3);
        c.set(0,5);
        System.out.println(c.get(0));
        c.remove(2);
        i.add(11);
        i.add(22);
        i.add(33);
        Iterator<Integer>ix=c.iterator();
        while(ix.hasNext()){
            System.out.println(ix.next());
        }
        
        c.remove(new Integer(5));

        System.out.println(c);
        System.out.println(i);
    }

    public static void reverse(List<Integer> firstElements) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reverse'");
    }
    
}
