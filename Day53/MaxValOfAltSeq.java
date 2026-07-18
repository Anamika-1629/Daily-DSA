import java.util.Scanner;

class Solution {
    public long maximumValue(int n, int s, int m) {
        if (n == 1) return s;
        
        // long i = (long)m+s; long j = i-1;
        // long res = i;
        
        // for (int x = 3; x < n; x+=2){
        //     i = j+m;
        //     j = i-1;
        //     res = i;
        // }

        // return res;

        long i = n/2;
        long res = (long)s+m+(i-1)*(m-1L);

        return res;
    }
}

public class MaxValOfAltSeq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int m = sc.nextInt();

        Solution sol = new Solution();
        System.out.println(sol.maximumValue(n, s, m));
        sc.close();
    }
}
