import java.util.*;

class Solution {
    public int maximumWidth(int[] planks) {
        int n = planks.length;
        Arrays.sort(planks);

        //all target
        HashSet <Integer> t = new HashSet<>();
        for (int i = 0; i < n; i++){
            t.add(planks[i]);
        }
        for (int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++){
                t.add(planks[i]+planks[j]);
            }
        }

        //frequencies
        HashMap <Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++){
            map.put(planks[i], map.getOrDefault(planks[i], 0)+1);
        }
        

        int maxCount = 0; //maxCount possible

        //iterate over the targets
        for (int tar : t){

            //count of current width possible
            int count = map.getOrDefault(tar,0);

            //for 2 pointers
            int i = 0; int j = n-1;
            while (i < j){
                if (planks[i]+planks[j] == tar) {
                    count++;
                    i++;
                    j--;
                }
                else if (planks[i]+planks[j] < tar) i++;
                else j--;
            }

            maxCount = Math.max(count, maxCount);
        }
        
        return maxCount;
    }
}

public class WidestPossibleFence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) p[i] = sc.nextInt();

        Solution sol = new Solution();
        System.out.println(sol.maximumWidth(p));
        sc.close();
    }    
}
