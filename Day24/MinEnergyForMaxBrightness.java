import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public long minEnergy(int n, int b, int[][] i) {
        Arrays.sort(i, (a,c) -> a[0] - c[0]);

        int s = i[0][0];
        int e = i[0][1];
        int time = 0;

        for (int x = 1; x < i.length; x++){
            if (i[x][0] <= e){
                e = Math.max(e, i[x][1]);
            }
            else{
                time += e-s+1;

                s = i[x][0];
                e = i[x][1];
            }
        }

        time += e-s+1;

        int bulb = (b+2)/3;

        long energy = 1L * time * bulb;
        return energy;    
    }
}

public class MinEnergyForMaxBrightness{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();

        int r = sc.nextInt(); int c = sc.nextInt();
        int[][] i = new int[r][c];

        Solution obj = new Solution();
        System.out.println(obj.minEnergy(n, b, i));
        sc.close();
    }
}