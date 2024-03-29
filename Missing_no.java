import java.util.Scanner;
class Solution {
    public int duplicates(int[] nums) {
        int n = nums.length;       
        for(int i=0;i<n;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
 return -1;       
    }

public class Missing_no {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputArray = input.split("\\s+");
  
        int[] nums = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            nums[i] = Integer.parseInt(inputArray[i]);
            Solution solution = new Solution();
            int missingNumber = solution.missingNumber(nums);
            System.out.println("Missing element is: " + missingNumber);
            sc.close();
        }
    }
    
}
}