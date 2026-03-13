import java.util.*;

class FirstUniqueCh {
    public int firstUniqChar(String s) {

        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        FirstUniqueCh obj = new FirstUniqueCh();
        int result = obj.firstUniqChar(s);

        System.out.println("Result is "+ result);

        sc.close();
    }
}