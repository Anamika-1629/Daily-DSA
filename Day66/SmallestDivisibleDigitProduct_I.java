import java.util.Scanner;

class Solution {
    public int smallestNumber(int n, int t) {
        while (true) {
            int product = 1;
            int num = n;

            while (num > 0) {
                product *= (num % 10);
                num /= 10;
            }

            if (product % t == 0) {
                return n;
            }

            n++;
        }
    }
}
public class SmallestDivisibleDigitProduct_I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();

        Solution sol = new Solution();
        System.out.println(sol.smallestNumber(n, t));
        sc.close();
    }    
}
