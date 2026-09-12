import java.util.*;

class Solution {
    public int countSpecialIntegers(int[] nums) {
        int count = 0;
        int n = nums.length;

        //store the unique element with all its occurances in hashmap
        HashMap <Integer, ArrayList <Integer>> vals = new HashMap<>();
        for (int i = 0; i < n; i++) {
            vals.putIfAbsent(nums[i], new ArrayList<>());
            vals.get(nums[i]).add(i);
        }

        for (ArrayList <Integer> idx : vals.values()){
            //if it occurs more than 2 times strictly
            if (idx.size() >= 3){
                boolean valid = true;

                //check special element condition
                int dif = idx.get(1)-idx.get(0);
                for (int j = 2; j < idx.size(); j++){
                    if (idx.get(j) - idx.get(j-1) != dif){
                        valid = false;
                        break;
                    }
                }

                if (valid) count++;
            }
        }

        return count;
    }
}

public class CountValsWithEqSpacedOccurance_II{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution sol = new Solution();
        System.out.println(sol.countSpecialIntegers(nums));
        sc.close();
    }
}

