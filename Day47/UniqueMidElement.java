import java.util.Scanner;

class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n = nums.length;

        int mid = n/2;

        int l = 0; int r = n-1;

        while (l < mid && r > mid){
            if (nums[l] == nums[mid] || nums[r] == nums[mid]) 
                return false;
            l++;
            r--;
        }

        return true;
        
    }
}

public class UniqueMidElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n]; 
        for (int i = 0; i < n; i++) num[i] = sc.nextInt();

        Solution s = new Solution();
        System.out.println(s.isMiddleElementUnique(num));
        sc.close();
    }    
}
