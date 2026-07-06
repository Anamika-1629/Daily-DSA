import java.util.Scanner;

class Solution {
    public int maxDigitRange(int[] nums) {
        int[] dr = new int[nums.length];
        int maxDR = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < nums.length; i++){
            String s = Integer.toString(nums[i]);
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for (int j = 0; j < s.length(); j++){
                int d = s.charAt(j) - '0';
                max = Math.max(max, d);
                min = Math.min(min, d);
            }

            dr[i] = max - min;
            maxDR = Math.max(maxDR, dr[i]);
        }

        for (int i = 0; i < nums.length; i++){
            if (dr[i] == maxDR){
                sum += nums[i];
            }
        }

        return sum;
    }
}

public class SumOfIntWithMaxDR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nm = new int[n];
        for (int i = 0; i < n; i++) nm[i] = sc.nextInt();

        Solution sol = new Solution();
        System.out.println(sol.maxDigitRange(nm));
        sc.close();
    }    
}
