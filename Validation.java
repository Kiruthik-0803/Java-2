import java.util.*;
public class Validation {
    public static void main(String[] args) {
        Stack<Character> bracs = new Stack<>();
        String brac = " ";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the brac: ");
        brac = sc.nextLine();
        sc.close();

        char[] charArray = brac.toCharArray();
        
        for (char c : charArray) {
            if (c == '('||c=='['||c=='{') {
                bracs.push(c);
            } else if (c == ')'||c==']'||c == '}') {
                if (!bracs.isEmpty() && bracs.peek() == '(') {
                    bracs.pop();
                } else {
                    System.out.println("Invalid");
                    return;
                }
            }
        }
        if (bracs.isEmpty()) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}