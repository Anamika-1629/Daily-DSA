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
class SolutionII {
    public int smallestNumber(int n, int t) {
        while (true){
            String temp = Integer.toString(n);

            int p = 1;
            for (int i = 0; i < temp.length(); i++){
                p *= temp.charAt(i) - '0';
            }

            if (p % t == 0) return n;
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

        SolutionII sol2 = new SolutionII();
        System.out.println(sol2.smallestNumber(n, t));
        sc.close();
    }    
}
