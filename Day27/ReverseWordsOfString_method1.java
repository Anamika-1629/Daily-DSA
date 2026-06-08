import java.util.Scanner;

class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");

        String res = words[words.length - 1];

        for (int i = words.length - 2; i >= 0; i--) {
            res += " " + words[i];
        }

        return res;
    }
}

public class ReverseWordsOfString_method1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();

        Solution obj = new Solution();
        System.out.println(obj.reverseWords(s));
        sc.close();
    }    
}
