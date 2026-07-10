import java.util.Scanner;

class Solution {
    public boolean canAliceWin(int[] nums) {
        int singleDigitSum = 0;
        int doubleDigitSum = 0;

        for (int num : nums) {
            if (num < 10) {
                singleDigitSum += num;
            } else {
                doubleDigitSum += num;
            }
        }

        return singleDigitSum != doubleDigitSum;
    }
}

public class DigitGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nm = new int[n];

        for (int i = 0; i < n; i++ ) nm[i] = sc.nextInt();

        Solution sol = new Solution();
        System.out.println(sol.canAliceWin(nm));
        sc.close();
    }
}
