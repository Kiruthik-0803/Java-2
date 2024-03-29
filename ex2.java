import java.util.*;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> l1 = new ArrayList<>();
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            l1.add(sc.nextInt());
        }
        System.out.print("Enter the index: ");
        int idx = sc.nextInt();
        sc.close();
        
        int start = 0;
        int end = idx - 1; 

        while (start < end) {
            int temp = l1.get(start);
            l1.set(start, l1.get(end));
            l1.set(end, temp);
            start++;
            end--;
        }

        System.out.println(l1);
    }
}