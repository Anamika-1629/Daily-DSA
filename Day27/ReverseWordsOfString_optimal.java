import java.util.Scanner;

class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");

        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);

            if (i > 0) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}

public class ReverseWordsOfString_optimal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();

        Solution obj = new Solution();
        System.out.println(obj.reverseWords(s));
        sc.close();
    }    
}