import java.util.ArrayList;
import java.util.Iterator;

public class ex4 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        Iterator<Integer> it = arrayList.iterator();
        while (it.hasNext()) {
            int next = it.next();
            if (next < min) {
                min = next;
            }
            if (next > max) {
                max = next;
            }
        }
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
