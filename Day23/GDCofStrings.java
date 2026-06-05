import java.util.Scanner;

class GCDofStrings {
    public String gcdOfStrings(String str1, String str2) {
        //1st --> check if concatinating both string commutatively gives same repeating patter
        //2nd --> if yes, find gcd of lengths of both string
        //3rd --> get the sequence of length of gcd --> ans

        if (!(str1+str2).equals(str2+str1)){
            return "";
        }
        else{

            int l1 = str1.length();
            int l2 = str2.length();

            while (l2 != 0){
                int temp = l2;
                l2 = l1%l2;
                l1 = temp;
            }

            StringBuilder p1 = new StringBuilder();
            
            for (int i = 0; i < l1; i++){
                p1.append(str1.charAt(i));
            }

            return p1.toString();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        GCDofStrings g = new GCDofStrings();
        System.out.println(g.gcdOfStrings(s, t));
        sc.close();
    }
}