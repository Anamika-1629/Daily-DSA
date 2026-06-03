import java.util.Scanner;

class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder res = new StringBuilder();

        int i = 0, j = 0;

        while (i < word1.length() && j < word2.length()) {
            res.append(word1.charAt(i++));
            res.append(word2.charAt(j++));
        }

        while (i < word1.length()) {
            res.append(word1.charAt(i++));
        }

        while (j < word2.length()) {
            res.append(word2.charAt(j++));
        }

        return res.toString();
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        MergeStringsAlternately m = new MergeStringsAlternately();
        System.out.println(m.mergeAlternately(s1, s2));

        sc.close();
    }
}