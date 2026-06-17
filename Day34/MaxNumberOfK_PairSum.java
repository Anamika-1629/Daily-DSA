
import java.util.Scanner;

class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;

        int i = 0, j = nums.length-1;

        while (i < j){
            int sum = nums[i]+ nums[j];
            if (sum == k){
                count++;
                i++; j--;
            }

            else if (sum < k) i++;
            else j--;
        }
    
        return count;

    }
}

public class MaxNumberOfK_PairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nm = new int[n];

        for (int i = 0; i < n; i++) nm[i] = sc.nextInt();

        int k = sc.nextInt();

        Solution obj = new Solution();
        System.out.println(obj.maxOperations(nm, k));
        sc.close();
    }
}
