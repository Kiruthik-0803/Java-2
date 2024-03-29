import java.util.*;

public class Solution1 {
    public static boolean isValid(String s) {
        Deque<Character> braces = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                braces.push(c);
            } if (braces.isEmpty()) {
                return false;
            }
                switch (c) {
                    case '}':
                        if (braces.peek() == '{') {
                            braces.pop();
                        } else {
                            braces.push(c);
                        }
                        break;
                    case ']':
                        if (braces.peek() == '[') {
                            braces.pop();
                        } else {
                            braces.push(c);
                        }
                        break;
                    case ')':
                        if (braces.peek() == '(') {
                            braces.pop();
                        } else {
                            braces.push(c);
                        }
                        break;
                }
            
        }

        return braces.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string containing brackets: ");
        String str = scanner.nextLine();
        
        System.out.println(Solution1.isValid(str));
        scanner.close(); 
    }

}