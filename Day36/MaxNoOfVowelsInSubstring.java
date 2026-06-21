import java.util.Scanner;

class Solution {
    public int maxVowels(String s, int k) {
        int c = 0;

        for (int i = 0; i < k; i++){
            char ch = s.charAt(i);
            if ("aeiou".indexOf(ch) != -1) c++;
        }

        int maxC = c;

        for (int j = k; j < s.length(); j++){
            char out = s.charAt(j-k);
            if ("aeiou".indexOf(out) != -1) c--;

            char in = s.charAt(j);
            if ("aeiou".indexOf(in) != -1) c++;

            maxC = Math.max(maxC, c);
        }

        return maxC;
    }
}

public class MaxNoOfVowelsInSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();

        Solution sol = new Solution();
        System.out.println(sol.maxVowels(s, k));
        sc.close();
    }
}
