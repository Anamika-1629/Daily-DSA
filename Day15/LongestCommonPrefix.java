import java.util.Scanner;

class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];  // take first string

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];

        for (int i = 0; i < n; i++){
            str[i] = sc.nextLine();
        }

        LongestCommonPrefix obj = new LongestCommonPrefix();
        String res = obj.longestCommonPrefix(str);

        System.out.println("Result is "+ res);
        sc.close();
    }
}