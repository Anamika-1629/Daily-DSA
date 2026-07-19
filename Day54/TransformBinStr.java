import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public boolean[] transformStr(String s, String[] strs) {
        boolean[] ans = new boolean[strs.length];

        // 1. Calculate number of ones in s and store their positions
        int count1 = 0;
        ArrayList <Integer> l1 = new ArrayList<>();
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '1') {
                l1.add(i);
                count1++;
            }
        }

        for (int i = 0; i < strs.length; i++){
            String str = strs[i]; 

            // 2. Count 1s and ?s in the current str
            int c1 = 0; 
            int ques = 0;
            for (char c : str.toCharArray()) {
                if (c == '1') c1++;
                else if (c == '?') ques++;
            }

            // Quick exit if it's mathematically impossible to match the 1s count
            if (c1 > count1 || c1 + ques < count1) {
                ans[i] = false;
                continue;
            }

            int neededOnes = count1 - c1;
            boolean possible = true;
            
            // 3. Match from RIGHT to LEFT to satisfy the condition: target_idx >= s_idx
            // We want to match the rightmost 1s of the target with the rightmost 1s of s.
            int x = count1 - 1; // Start from the last '1' in s

            for (int j = str.length() - 1; j >= 0; j--) {
                char currentCar = str.charAt(j);
                
                // If it's a '1', or if it's a '?' and we still need to turn '?' into '1's
                if (currentCar == '1' || (currentCar == '?' && neededOnes > 0)) {
                    if (currentCar == '?') {
                        neededOnes--; // We used a question mark as a '1'
                    }
                    
                    // If the target position j is less than the original position in s,
                    // then this transformation is impossible.
                    if (j < l1.get(x)) {
                        possible = false;
                        break;
                    }
                    
                    x--; // Move to the next '1' in s moving backwards
                }
            }

            ans[i] = possible;
        }

        return ans;
    }
}

public class TransformBinStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input original string
        String s = sc.next();

        // Number of query strings
        int m = sc.nextInt();

        String[] strs = new String[m];

        for (int i = 0; i < m; i++) {
            strs[i] = sc.next();
        }

        Solution obj = new Solution();
        boolean[] ans = obj.transformStr(s, strs);

        System.out.println(Arrays.toString(ans));

        sc.close();
    }    
}
