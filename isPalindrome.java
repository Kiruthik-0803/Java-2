import java.util.*;

public class isPalindrome {
  
  private static boolean isPalindrome(String s) {
      Stack<Character> stack = new Stack<>();
      int mid = s.length() / 2;
      
      for (int i = 0; i < mid; i++) {
          stack.push(s.charAt(i));
      }
      
      if (s.length() % 2 != 0) {
          mid++;
      }
      
      for (int i = mid; i < s.length(); i++) {
          if (s.charAt(i) != stack.pop()) {
              return false;
          }
      }
      
      return true;
  }

  public static void main(String args[]) {
      String input1 = "MADAM";
      String input2 = "ROCKET";
      System.out.println(isPalindrome(input1));
      System.out.println(isPalindrome(input2));

  }
}