public class TimeComplexities {
    
    public static void main(String[] args) {
        int n = 10; 
        int i = 0;
        while (i < n) {
            int j = n;
            while (j > 1) {
                j = j / 2;
                System.out.println(j);
            }
i++;
        }
    }
}