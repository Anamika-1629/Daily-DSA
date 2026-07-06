import java.util.Scanner;

class Solution {
    public boolean canMakeSubsequence(String s, String t) {
        int m = s.length(), n = t.length();

        if (m > n) return false;

        int[] pref = new int[m];
        int[] suff = new int[m];

        int j = 0;
        for (int i = 0; i < m; i++) {
            while (j < n && s.charAt(i) != t.charAt(j))
                j++;

            if (j == n)
                pref[i] = Integer.MAX_VALUE;
            else {
                pref[i] = j;
                j++;
            }
        }

        if (pref[m - 1] != Integer.MAX_VALUE)
            return true;

        j = n - 1;
        for (int i = m - 1; i >= 0; i--) {
            while (j >= 0 && s.charAt(i) != t.charAt(j))
                j--;

            if (j < 0)
                suff[i] = -1;
            else {
                suff[i] = j;
                j--;
            }
        }

        for (int i = 0; i < m; i++) {

            int l = (i == 0) ? -1 : pref[i - 1];
            int r = (i == m - 1) ? n : suff[i + 1];

            if (l == Integer.MAX_VALUE)
                continue;

            if (r == -1)
                continue;

            if (r - l > 1)
                return true;
        }

        return false;
    }

}

public class SubsequenceAfterOnceReplacement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        Solution sol = new Solution();
        System.out.println(sol.canMakeSubsequence(s, t));
        sc.close();
    }    
}
