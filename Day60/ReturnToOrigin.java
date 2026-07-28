import java.util.Scanner;

class Solution {

    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;

        for (char move : moves.toCharArray()) {
            switch (move) {
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                case 'L':
                    x--;
                    break;
                case 'R':
                    x++;
                    break;
            }
        }

        return x == 0 && y == 0;
    }
}
public class ReturnToOrigin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: e.g. UDLR
        String moves = sc.nextLine();

        Solution obj = new Solution();
        System.out.println(obj.judgeCircle(moves));

        sc.close();
    }    
}
