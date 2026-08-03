import java.util.Scanner;

class Solution {
    public long maxPairStrength(int[] nums) {
        long max = 0;

        for (int i = 0; i < nums.length-1; i++){
            for (int j = i+1; j < nums.length; j++){
                int x = gcd(nums[i], nums[j]);
                int g = x*x;

                long str = 1L*nums[i]*nums[j]/g;

                max = Math.max(max, str);
            }
        }

        return max;
    }
    private int gcd(int a, int b){
        if (b==0) return a;

        return gcd(b, a%b);
    }
}

public class MaxPairStrengthUsingGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nm = new int[n];
        for (int i = 0; i < n; i++) nm[i] = sc.nextInt();

        Solution sol = new Solution();
        System.out.println(sol.maxPairStrength(nm));
        sc.close();
    }    
}
