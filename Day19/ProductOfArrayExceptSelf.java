import java.util.Scanner;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];

        res[0] = 1; //initial prefix product at index 0 --> always 1, no prefix 

        //prefix product loop
        for (int i = 1; i < nums.length; i++){
            //multiply last index value of res(prefix product) with that of nums
            res[i] = res[i-1]*nums[i-1]; 
        }

        int suffix = 1; //suffix product for last element --> always 1

        for (int i = nums.length-1; i >= 0; i--){
            res[i] *= suffix; //multiply current prefix product with suffix product
            suffix *= nums[i]; //update suffix product
        }

        return res;
    }
}

class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] nums = new int[n];

        for (int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        int[] res = obj.productExceptSelf(nums);

        for (int i = 0; i < res.length; i++){
            System.out.println(res[i]);
        }

        sc.close();
    }
}