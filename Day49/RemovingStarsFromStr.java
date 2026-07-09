import java.util.Scanner;

class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == '*') {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}

public class RemovingStarsFromStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Solution sol = new Solution();
        System.out.println(sol.removeStars(s));
    }
}
