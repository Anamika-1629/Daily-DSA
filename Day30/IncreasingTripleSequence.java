import java.util.Scanner;

class Solution {
    public boolean increasingTriplet(int[] nums) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] <= a) a = nums[i];

            else if (nums[i] <= b) b = nums[i];

            else return true;
        }

        return false;

    }
}

public class IncreasingTripleSequence{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        System.out.println(obj.increasingTriplet(nums));
        sc.close();
    }
}
