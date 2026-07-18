import java.util.Scanner;

class Solution {
    public String rearrangeString(String s, char x, char y) {
        int n = s.length();

        StringBuilder sb = new StringBuilder();

        int countX = 0; int countY = 0;

        for (int i = 0; i < n; i++){
            if (s.charAt(i) == x) countX++;
            else if (s.charAt(i) == y) countY++;
        }

        if (countX == 0 || countY == 0) return s;

        for (int i = 0; i < countY; i++){
            sb.append(y);
        }

        for (int i = 0; i < n; i++){
            if (s.charAt(i) != y) sb.append(s.charAt(i));
        }

        return sb.toString();
        
    }
}

public class AvoidCharPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char x = sc.next().charAt(0);
        char y = sc.next().charAt(0);

        Solution obj = new Solution();
        System.out.println(obj.rearrangeString(s, x, y));

        sc.close();
    }
}
