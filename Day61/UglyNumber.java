import java.util.Scanner;

class Solution {
    public boolean isUgly(int n) {
        if (n == 0) return false;
        else if (n == 1) return true;

        while (n%2 == 0) n /= 2;
        while (n%3 == 0) n /= 3;
        while (n%5 == 0) n /= 5;

        return n == 1;        
    }
}

public class UglyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Solution sol = new Solution();
        System.out.println(n+" is an ugly number? "+sol.isUgly(n));
        sc.close();
    }
    
}
