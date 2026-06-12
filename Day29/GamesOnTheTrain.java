import java.util.Scanner;

public class GamesOnTheTrain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int j = 0; j < n; j++){
                arr[j] = sc.nextInt();
            }

            GamesOnTheTrain obj = new GamesOnTheTrain();
            System.out.println(obj.maxHeight(n, arr));
        }
        sc.close();
    }

    public int maxHeight(int n, int[] arr){
        int maxV = Integer.MIN_VALUE;
        int minV = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++){
            if (arr[i] > maxV) {
                maxV = arr[i];
            }
            if (arr[i] < minV){
                minV = arr[i];
            }
        }

        int k = maxV - minV + 1;

        return k;
    }    
}
