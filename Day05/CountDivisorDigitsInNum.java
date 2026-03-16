import java.util.*;

class CountDivisorDigitsInNum {
    public int countDigits(int num) {
        int[] digits = integerArray(num);

        int len = digits.length;
        int divisors = 0;

        for (int j = 0; j < len; j++){
            if (num % digits[j] == 0){
                divisors ++;
            }
        }

        return divisors;
    }

    public static int[] integerArray(int n){
        String s = Integer.toString(n);

        int [] digits = new int[s.length()];

        for (int i = 0; i < s.length(); i++){
            digits[i] = s.charAt(i) - '0';
        }

        return digits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        CountDivisorDigitsInNum obj = new CountDivisorDigitsInNum();
        int result = obj.countDigits(num);

        System.out.println(result);
        sc.close();
    }
}