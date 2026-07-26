import java.util.Scanner;

class Solution {

    public boolean checkIfPangram(String sentence) {
        boolean[] seen = new boolean[26];

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            seen[ch - 'a'] = true;
        }

        for (int i = 0; i < 26; i++) {
            if (!seen[i]) {
                return false;
            }
        }

        return true;
    }
}

public class PangramCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the sentence: ");
        String sentence = sc.nextLine();

        Solution obj = new Solution();

        if (obj.checkIfPangram(sentence)) {
            System.out.println("The sentence is a Pangram.");
        } else {
            System.out.println("The sentence is NOT a Pangram.");
        }

        sc.close();
    }
}