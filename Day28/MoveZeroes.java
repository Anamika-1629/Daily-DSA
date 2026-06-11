
import java.util.Scanner;

class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;

        for (int i = 0; i < nums.length; i++){

            // If nums[i] is non-zero, swap it to position j
            // and then move j to the next available position.
            if (nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }       
        
    }
}

public class MoveZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        obj.moveZeroes(arr);

        for (int i : arr){
            System.out.println(i+" ");
        }
        sc.close();
    }    
}
