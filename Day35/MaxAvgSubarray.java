
import java.util.Scanner;

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        /*
        Approach 2:
        Efficient, but indexing is a little delicate. 
        Time Complexity = O(n), Space Complexity = O(1)
        
        int sum = 0;

        for (int i = 0; i < k-1; i++){
            sum += nums[i];
        }

        double maxAvg = Integer.MIN_VALUE;

        int st = 0; int end = k-1;
        while (end < nums.length){
            sum += nums[end];
            maxAvg = Math.max(maxAvg, ((double) sum/k));
            sum -= nums[st];

            st++; end++;
        }

        return maxAvg;
        */

//---------------------------------------------------------------------------------

        /*
        Approach 3:
        Efficient, clean, and the standard sliding-window template. 
        Time Complexity = O(n), Space Complexity = O(1)
        */

        int sum = 0;

        for (int i = 0; i < k; i++){
            sum += nums[i];
        }

        int maxSum = sum;
        for (int j = k; j < nums.length; j++){
            sum += nums[j];
            sum -= nums[j-k];

            maxSum = Math.max(maxSum, sum);
        }

        return (double)maxSum/k;

    }
}

public class MaxAvgSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nm = new int[n];
        for (int i = 0; i<n; i++) nm[i] = sc.nextInt();

        int k = sc.nextInt();

        Solution obj = new Solution();
        System.out.println(obj.findMaxAverage(nm, k));

        sc.close();
    }

    
}
