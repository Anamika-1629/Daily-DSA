import java.util.Scanner;

class Solution {
    public int maxArea(int[] height) {
        int maxA = 0;

        int i = 0;
        int j = height.length - 1;

        while (i < j){
            int w = j-i;
            int l = Math.min(height[i],height[j]);

            int a = w*l;
            maxA = Math.max(a, maxA);

            if (height[i] < height[j]) i++;
            else j--;
        }

        return maxA;
        
        
    }
}

public class ContainerWithMostWater{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];

        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        System.out.println(obj.maxArea(h));
        sc.close();
    }
}