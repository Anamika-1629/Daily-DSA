import java.util.*;

class Solution {
    public boolean closeStrings(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();

        if (n1 != n2) return false;

        HashSet <Character> w1 = new HashSet<>();
        for (char c : word1.toCharArray()) w1.add(c);

        HashSet <Character> w2 = new HashSet<>();
        for (char c : word2.toCharArray()) w2.add(c);

        if (!w1.equals(w2)) return false;

        HashMap <Character, Integer> m1 = new HashMap<>();
        for (char c : word1.toCharArray()) m1.put(c, m1.getOrDefault(c, 0)+1);

        HashMap <Character, Integer> m2 = new HashMap();
        for (char c : word2.toCharArray()) m2.put(c, m2.getOrDefault(c, 0)+1);

        ArrayList <Integer> f1 = new ArrayList<>(m1.values());
        ArrayList <Integer> f2 = new ArrayList<>(m2.values());

        Collections.sort(f1); Collections.sort(f2);

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
