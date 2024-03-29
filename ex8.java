import java.util.ArrayList;
import java.util.HashSet;

public class ex8 {
    public static void main(String[] args) {
        ArrayList<Integer> listWithDuplicates = new ArrayList<>();
        listWithDuplicates.add(1);
        listWithDuplicates.add(2);
        listWithDuplicates.add(3);
        listWithDuplicates.add(2); 
        listWithDuplicates.add(4);
        listWithDuplicates.add(1); 

        System.out.println("ArrayList with duplicates: " + listWithDuplicates);
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> uniqueList = new ArrayList<>();
        for (Integer element : listWithDuplicates) {
            if (!set.contains(element)) {
                set.add(element);
                uniqueList.add(element);
            }
        }

        System.out.println("ArrayList after removing duplicates: " + uniqueList);
    }
}
