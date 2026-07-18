import java.util.Scanner;

class Solution {
    public int minAdjacentSwaps(int[] nums, int a, int b) {
        int n = nums.length;
        int[] cat = new int[n];

        for (int i = 0; i < n; i++) {
            if (nums[i] < a) cat[i] = 1;
            else if (nums[i] > b) cat[i] = 3;
            else cat[i] = 2;
        }

        long cL = 0, cM = 0;
        long swaps = 0;
        int MOD = 1_000_000_007;

        for (int i = n - 1; i >= 0; i--) {
            if (cat[i] == 1) {
                cL++;
            } else if (cat[i] == 2) {
                swaps += cL;
                cM++;
            } else {
                swaps += cL + cM;
            }
        }

        return (int)(swaps % MOD);
    }
}

public class MinAdjacentSwapToPartitionArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int a = sc.nextInt();
        int b = sc.nextInt();

        Solution obj = new Solution();
        System.out.println(obj.minAdjacentSwaps(nums, a, b));

        sc.close();
    }    
}
