import java.util.*;

class SumMultiplies {
    public int sumOfMultiples(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        SumMultiplies obj = new SumMultiplies();
        int res = obj.sumOfMultiples(n);

        System.out.println("Result is "+res);
    }
}