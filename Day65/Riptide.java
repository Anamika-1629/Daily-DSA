import java.util.Scanner;

public class Riptide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for (int i = 0; i < t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            System.out.println(findRounds(a, b, c));
        }
    }   
    public static int findRounds(int a, int b, int c) {
        int rounds = 0;

        while (true) {

            if (a == b || b == c || a == c)
                return rounds;

            if (a > b && a > c) {
                if (b < c) {
                    a--;
                    b++;
                } else {
                    a--;
                    c++;
                }
            }
            else if (b > a && b > c) {
                if (a < c) {
                    b--;
                    a++;
                } else {
                    b--;
                    c++;
                }
            }
            else {
                if (a < b) {
                    c--;
                    a++;
                } else {
                    c--;
                    b++;
                }
            }

            rounds++;
    }
} 
}
