import java.util.Scanner;

class Solution {

    public int nthUglyNumber(int n, int a, int b, int c) {

        long low = 1;
        long high = 2_000_000_000L;

        while (low < high) {

            long mid = low + (high - low) / 2;

            if (count(mid, a, b, c) >= n)
                high = mid;
            else
                low = mid + 1;
        }

        return (int) low;
    }

    private long count(long x, long a, long b, long c) {

        long ab = lcm(a, b);
        long ac = lcm(a, c);
        long bc = lcm(b, c);
        long abc = lcm(ab, c);

        return x / a + x / b + x / c
                - x / ab - x / ac - x / bc
                + x / abc;
    }

    private long gcd(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    private long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }
}

public class UglyNumberIII {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        Solution sol = new Solution();
        System.out.println(sol.nthUglyNumber(n, a, b, c));

        sc.close();
    }    
}
