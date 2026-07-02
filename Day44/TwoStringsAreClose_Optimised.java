import java.util.*;

/*
This approach depends on the alphabet constaint as it will decide the length for the array.

For given problem constraint, we only have lowercase alphabets, hence array len = 26.
Time Complexity - O(n)
Space Complexity - O(1)
*/
class Solution {
    public boolean closeStrings(String word1, String word2) {

        //Condition 1 - Compare lengths
        int n1 = word1.length();
        int n2 = word2.length();

        if (n1 != n2) return false;

        int[] f1 = new int[26];
        int[] f2 = new int[26];

        for (char c : word1.toCharArray()) f1[c-'a']++;
        for (char c : word2.toCharArray()) f2[c-'a']++;

        //Condition 2 - Check if both have same unique characters 
        for (int i = 0; i < 26; i++) {
            if ((f1[i] == 0) != (f2[i] == 0))
            return false;
        }

        //Condtion 3 - Check frequency match irrespective of the order
        Arrays.sort(f1); Arrays.sort(f2);
        if (!Arrays.equals(f1, f2)) return false;
        
        return true;        
    }
}

public class TwoStringsAreClose_Optimised {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w1 = sc.nextLine();
        String w2 = sc.nextLine();

        Solution sol = new Solution();
        System.out.println(sol.closeStrings(w1, w2));
        sc.close();
    }
}
