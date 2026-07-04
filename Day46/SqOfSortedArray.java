import java.util.Scanner;

class Solution {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length;i++){
            nums[i] = nums[i]*nums[i];
        }

        int[] sq = new int[nums.length]; 

        int left = 0; 
        int right = sq.length-1;
        int idx = sq.length-1;       

        while (left <= right){
            if (nums[left] > nums[right]){
                sq[idx] = nums[left];
                left++;
            }
            else {
                sq[idx] = nums[right];
                right--;
            }
            idx--;
        }

        return sq;
        
    }
}

public class SqOfSortedArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] nm = new int[n];

        for (int i = 0; i < n; i++) nm[i] = sc.nextInt();

        Solution sol = new Solution();
        int[] res = sol.sortedSquares(nm);
        for (int i : res) System.out.println(i);
        sc.close();
    }    
}
