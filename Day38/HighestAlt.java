import java.util.Scanner;

class Solution {
    public int largestAltitude(int[] gain) {
        int alt = 0;
        int maxAlt = Integer.MIN_VALUE;

        for (int i = 0; i < gain.length; i++){
            int x = gain[i];
            alt = alt+x;

            if (maxAlt < alt) maxAlt = alt;
        }

        if (maxAlt > 0) return maxAlt;
        return 0;
    }
}

public class HighestAlt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] g = new int[n];

        for (int i = 0; i <n; i++) g[i] = sc.nextInt();

        Solution sol = new Solution();
        System.out.println(sol.largestAltitude(g));
        sc.close();
    }    
}
