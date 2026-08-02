import java.util.Scanner;

class Solution {
    public int countValidPrefixes(String s) {
        int count = 0;

        int zeroes=0; int ones=0;

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '0') zeroes++;
            else ones++;

            if (Math.abs(zeroes-ones) <= 1) count++;
        }

        return count;
    }
}

public class CountValidPrefixes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Solution sol = new Solution();
        System.out.println(sol.countValidPrefixes(s));
        sc.close();
    }    
}
