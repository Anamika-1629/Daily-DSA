import java.util.Scanner;

class Solution {
    public boolean canReach(int[] start, int[] target) {
        int s = (start[0]+start[1]) % 2;
        int t = (target[0]+target[1]) % 2;

        return s == t;
    }
}
public class EvenNoOfKnightMoves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] start = new int[2];
        int[] target = new int[2];

        // Input start coordinates
        start[0] = sc.nextInt(); start[1] = sc.nextInt();

        // Input target coordinates
        target[0] = sc.nextInt(); target[1] = sc.nextInt();

        Solution obj = new Solution();
        System.out.println(obj.canReach(start, target));

        sc.close();
    }
}
