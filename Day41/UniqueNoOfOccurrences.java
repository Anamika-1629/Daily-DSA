import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap <Integer, Integer> map = new HashMap<>();

        for (int i : arr){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // boolean[] seen = new boolean[arr.length+1];

        // for (int j : map.values()){
        //     if (seen[j]) return false;
        //     seen[j] = true;
        // }

        // return true;

        HashSet<Integer> set = new HashSet<>();

        for (int freq : map.values()) {
            if (!set.add(freq))
                return false;
        }

        return true;
    }
}

public class UniqueNoOfOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        Solution sol = new Solution();
        System.out.println(sol.uniqueOccurrences(arr));
        sc.close();
    }    
}
