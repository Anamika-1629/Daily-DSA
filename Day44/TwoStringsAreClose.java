import java.util.*;

/*
It works for any character set.
Time Complexity (general alphabet) - O(n + k log k)
Space Complexity (general alphabet) - O(k)

For given problem constraints, we only have lowercase alphabets.
Hence, Time Complexity - O(n) & Space Complexity - O(1).
*/
class Solution {
    public boolean closeStrings(String word1, String word2) {

        //Condition 1 - Compare lengths
        int n1 = word1.length();
        int n2 = word2.length();
        if (n1 != n2) return false;

        HashMap <Character, Integer> m1 = new HashMap<>();
        for (char c : word1.toCharArray()) m1.put(c, m1.getOrDefault(c, 0)+1);

        HashMap <Character, Integer> m2 = new HashMap<>();
        for (char c : word2.toCharArray()) m2.put(c, m2.getOrDefault(c, 0)+1);

        ArrayList <Integer> f1 = new ArrayList<>(m1.values());
        ArrayList <Integer> f2 = new ArrayList<>(m2.values());
        Collections.sort(f1); Collections.sort(f2);

        //Condition 2 - Check if both have same unique characters 
        if (!m1.keySet().equals(m2.keySet())) return false;

        //Condtion 3 - Check frequency match irrespective of the order
        if (!f1.equals(f2)) return false;

        return true;
        
    }
}

public class TwoStringsAreClose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w1 = sc.nextLine();
        String w2 = sc.nextLine();

        Solution sol = new Solution();
        System.out.println(sol.closeStrings(w1, w2));
        sc.close();
    }
}
