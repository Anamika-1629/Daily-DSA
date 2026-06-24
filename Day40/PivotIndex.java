import java.util.Scanner;

class Solution {
    public int pivotIndex(int[] nums) {
        int left = 0; int right = 0;

        for(int i = 0; i < nums.length; i++){
            right += nums[i];
        }    

        for (int i = 0; i < nums.length; i++){
            right -= nums[i];
            if (left == right) return i;
            left += nums[i];
        }

        return -1;
    }
}

public class PivotIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nm = new int[n];

        for (int i = 0; i< n; i++) nm[i] = sc.nextInt();

        Solution sol = new Solution();
        System.out.println(sol.pivotIndex(nm));
        sc.close();
    }
}
