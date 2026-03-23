import java.util.Scanner;

class LongestSubStringNR {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int count = 0;

        for (int i = 0; i < n; i++){
            boolean [] visited = new boolean[256];

            for (int j = i; j < n; j++){
                char ch = s.charAt(j);

                if (visited[ch]){
                    break;    
                }

                else{
                    count = Math.max(count, j-i+1);
                    visited[ch] = true;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        LongestSubStringNR obj = new LongestSubStringNR();
        int result = obj.lengthOfLongestSubstring(s);

        System.out.println("Result is "+result);
        sc.close();        
    }
}