import java.util.Scanner;

class DivisibleAndNonDivisibleSumDifference {
    public int differenceOfSums(int n, int m) {
        int num1 = 0;
        int num2 = 0;

        for (int i = 1; i <= n; i++){
            if (i % m != 0){
                num1 += i;
            }

            else {
                num2 += i;
            }
        }

        int difference = num1 - num2;
        return difference;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        DivisibleAndNonDivisibleSumDifference obj = new DivisibleAndNonDivisibleSumDifference();
        int result = obj.differenceOfSums(n, m);

        System.out.println("Result is "+result);
        sc.close();
    }
}