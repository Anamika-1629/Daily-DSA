import java.util.Scanner;

class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int best = nums[0];
        int maxSum = -1;

        for (int j = k; j < nums.length; j++){
            best = Math.max(best, nums[j-k]);
            maxSum = Math.max(maxSum, best+nums[j]);
        }

        return maxSum;
    }
}

public class MaxValidPairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nm = new int[n];
        for (int i = 0; i < n; i++) nm[i] = sc.nextInt();

        int k = sc.nextInt();

        Solution s = new Solution();
        System.out.println(s.maxValidPairSum(nm, k));
        sc.close();
    }    
}
