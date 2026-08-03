import java.util.Scanner;

class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
        double ratio = (double)a/b;
        int count = 0;
        
        for (int i = 0; i < nums.length; i++){
            int even = 0; int odd = 0;
            for (int j = i; j < nums.length; j++){
                if (nums[j] % 2 == 0) even++;
                else odd++;

                if (odd > 0 && (double)even/odd <= ratio) count++;
            }
        }

        return count;
    }
}

public class CountSubarraysWithOddEvenRatio_I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nm = new int[n];
        for (int i = 0; i < n; i++) nm[i] = sc.nextInt();

        int a = sc.nextInt();
        int b = sc.nextInt();

        Solution sol = new Solution();
        System.out.println(sol.countRatioSubarrays(nm, a, b));
        sc.close();        
    }    
}
