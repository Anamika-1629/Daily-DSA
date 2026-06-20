import java.util.Scanner;

/*Approach 1:
Slow but straightforward --> Brute Force
Time Complexity ≈ O(nk), Space Complexity = O(1)*/
class Solution{
    public double maxAvg(int[] nums, int k){
        int i = 0;
        int j = k;

        double maxAvg = Integer.MIN_VALUE;

        while (j <= nums.length){
            int sum = 0;
            for (int st = i; st < j; st++){
                sum += nums[st];
            }

            maxAvg = Math.max(maxAvg, ((double)sum/k));
            i++; j++;
        }

        return maxAvg;
    }
}
public class MaxAvgSubarray_bruteforce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nm = new int[n];
        for (int i = 0; i<n; i++) nm[i] = sc.nextInt();

        int k = sc.nextInt();

        Solution obj = new Solution();
        System.out.println(obj.maxAvg(nm, k));

        sc.close();
    }    
}
