//Time Complexity- O(n), Space Complexity - O(k)

import java.util.Scanner;

class Solution {
    public String reverseVowels(String s) {
        List <Character> vowels = new ArrayList<>();

        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);

            if ("aeiouAEIOU".indexOf(c) != -1){
                vowels.add(c);
            }
        }

        int l = vowels.size()-1;

        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < s.length(); j++){
            char c = s.charAt(j);

            if ("aeiouAEIOU".indexOf(c) != -1){
                sb.append(vowels.get(l));
                l--;
            }
            else{
                sb.append(s.charAt(j));
            }
        }

        return sb.toString();
    }
}

public class ReverserVowelsOfString_method1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Solution obj = new Solution();
        System.out.println(obj.reverseVowels(s));
        sc.close();
    }
}
