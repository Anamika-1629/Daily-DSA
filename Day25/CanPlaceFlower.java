import java.util.Scanner;

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;

        for (int i = 0; i < flowerbed.length; i++) {

            if (flowerbed[i] == 0) {

                boolean left = (i == 0) || (flowerbed[i - 1] == 0);
                boolean right = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);

                if (left && right) {
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }

        return count >= n;
    }
}

public class CanPlaceFlower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] fb = new int[k];
        for (int i = 0; i < k; i++) {
            fb[i] = sc.nextInt();            
        }

        Solution obj = new Solution();
        System.out.println(obj.canPlaceFlowers(fb, n));

        sc.close();
    }    
}
