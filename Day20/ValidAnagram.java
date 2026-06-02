import java.util.Arrays;
import java.util.Scanner;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length()!= t.length()){
            return false;
        }
        else{
            char[] sChar = s.toCharArray();
            Arrays.sort(sChar);

            char[] tChar = t.toCharArray();
            Arrays.sort(tChar);

            return Arrays.equals(sChar,tChar);}
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        ValidAnagram obj = new ValidAnagram();
        Boolean res = obj.isAnagram(s, t);
        System.out.println(res);

        sc.close();
    }
}
