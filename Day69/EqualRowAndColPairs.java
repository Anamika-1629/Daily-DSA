import java.util.*;

class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;

        String[] row = new String[n];

        for (int i = 0; i < n; i++){
            String r = "";
            for (int j = 0; j < n; j++){
                r += Integer.toString(grid[i][j]);
                r+="-";
            }
            row[i] = r;
        }

        int count = 0;
        for (int i = 0; i < n; i++){
            String c = "";
            for (int j =0; j < n; j++){
                c += Integer.toString(grid[j][i]);
                c += "-";
            }

            for (int k = 0; k < n; k++){
                if (row[k].equals(c)) count++;
            }
        }

        return count;
    }
}

public class EqualRowAndColPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] g = new int[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) g[i][j] = sc.nextInt();
        }

        Solution sol = new Solution();
        System.err.println(sol.equalPairs(g));
        sc.close();
    }
}
