import java.util.Scanner;

class Solution {
    public int minMergedInteger(int[] nums) {
        int min = Integer.MAX_VALUE;

        for (int i = 1; i < nums.length; i+=2){
            String value = Integer.toString(nums[i-1]) + Integer.toString(nums[i]);
            int val = Integer.parseInt(value);

            min = Math.min(val, min);
        }

        return min;
    }
}

public class MinValOfMergedInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nm = new int[n];
        for (int i = 0; i < n; i++) nm[i]= sc.nextInt(i);

        Solution sol = new Solution();
        System.out.println(sol.minMergedInteger(nm));
        sc.close();
    }    
}
