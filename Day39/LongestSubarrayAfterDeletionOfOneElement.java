import java.util.Scanner;

/*
This problem is a special case of 1004. Max Consecutive Ones III 
with k = 1 (fixed mandatory deletion of one element) */
class Solution {
    public int longestSubarray(int[] nums) {
        int l = 0; int r = 0;
        
        int zeroes = 0;
        int maxArr = Integer.MIN_VALUE;

        while (r < nums.length){
            if (nums[r] == 0) zeroes++;

            while (zeroes > 1){
                if (nums[l] == 0) zeroes--;
                l++;
            }

            maxArr = Math.max(maxArr, r-l+1);
            r++;
        }

        //In 1004, we flipped the element, but here, we are deleting the present 0 (or 1 if not 0 available)
        //hence, maxArr-1
        return maxArr-1; 
        
    }
}

public class LongestSubarrayAfterDeletionOfOneElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nm = new int[n];

        for (int i = 0; i < n; i++) nm[i] = sc.nextInt();

        Solution sol = new Solution();
        System.out.println(sol.longestSubarray(nm));
        sc.close();
    }
}
