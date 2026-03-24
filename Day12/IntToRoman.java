import java.util.Scanner;

class IntToRoman {
    public String intToRoman(int num) {
        int[] values = {
            1000, 900, 500, 400,
            100, 90, 50, 40,
            10, 9, 5, 4, 1
        };

        String[] symbols = {
            "M", "CM", "D", "CD",
            "C", "XC", "L", "XL",
            "X", "IX", "V", "IV", "I"
        };

        StringBuilder roman = new StringBuilder();

        for (int i = 0; i < values.length; i++) {

            //we are checking if the number is greater than the values at i index
            //if yes --> append the symbol at index i to the string
            //subtract the value from num
            //check this condition until all the values are comapred and processed
            while (num >= values[i]) {
                roman.append(symbols[i]);
                num -= values[i];
            }
        }

        return roman.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        IntToRoman obj = new IntToRoman();
        String romanVal = obj.intToRoman(num);

        System.out.println("Roman value for "+num+"is "+romanVal);

        sc.close();
    }
}