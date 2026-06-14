import java.util.Scanner;

class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        
        int i = 0; int j = 0;

        while (i < n){
            int count = 1;
            char ch = chars[i];
            
            while (i+1 < n && chars[i] == chars[i+1]){
                count++; i++;
            }

            chars[j++] = ch;
            String cnt = String.valueOf(count);

            if (count > 1){
                for (int x = 0; x < cnt.length(); x++){
                    chars[j] = cnt.charAt(x);
                    j++;
                }
            }

            i++;

        }

        return j;
        
    }
}

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] c = new char[n];

        for (int i = 0; i < n; i++){
            c[i] = sc.next().charAt(0);
        }

        Solution obj = new Solution();
        int len = obj.compress(c);

        for (int i = 0; i < len; i++) {
            System.out.print(c[i] + " ");
        }
    }    
}
