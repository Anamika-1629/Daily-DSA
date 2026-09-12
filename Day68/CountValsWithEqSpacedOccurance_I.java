import java.util.*;

class Solution {
    public int countSpecialIntegers(int[] nums) {
        int count = 0; 
        int n = nums.length;

        HashSet <Integer> elements = new HashSet<>();            
        for (int i = 0; i < n; i++){
            elements.add(nums[i]);
        }

        for (int i : elements){
            ArrayList <Integer> idx = special(i, nums);

            if (idx.size() == 3){
                int i1 = idx.get(0);
                int i2 = idx.get(1);
                int i3 = idx.get(2);

                if (i2-i1 == i3-i2){
                    count++;
                }
            
            }
        }
        return count;
        
    }

    private ArrayList<Integer> special(int n,int[] nums){
        ArrayList <Integer> idx = new ArrayList<>();

        for (int i = 0; i < nums.length; i++){
            if (nums[i] == n) {
                idx.add(i);}
        }

        return idx;
    }
}


public class CountValsWithEqSpacedOccurance_I{
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