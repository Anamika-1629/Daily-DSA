//Optimal -> time complexity = O(n), space complexity = O(1) [No extra list/stack/string builder is used]

import java.util.Scanner;

class Solution {
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {

            if (!isVowel(ch[l])) {
                l++;
            }
            else if (!isVowel(ch[r])) {
                r--;
            }
            else {
                char temp = ch[l];
                ch[l] = ch[r];
                ch[r] = temp;

                l++;
                r--;
            }
        }

        return new String(ch);
    }

    public boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}

public class ReverseVowelsOfString_optimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Solution obj = new Solution();
        System.out.println(obj.reverseVowels(s));
        sc.close();
    }
}
