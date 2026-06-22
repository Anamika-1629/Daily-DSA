import java.util.Scanner;

class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0; int right = 0;

        int zeroC = 0;
        int ans = Integer.MIN_VALUE;

        while(right < nums.length){
            if (nums[right] == 0) {
                zeroC++; 
            }

            while (zeroC > k){
                if (nums[left] == 0) zeroC--;
                left++;
            }

            ans = Math.max(ans, right-left+1);  
            right++;
        }

        return ans;
    }   
}

public class MaxConsecutiveOnes {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nm = new int[n];

        for(int i = 0; i < n; i++) nm[i] = sc.nextInt();

        int k = sc.nextInt();

        Solution sol = new Solution();
        System.out.println(sol.longestOnes(nm, k));

        sc.close();
    }    
}
