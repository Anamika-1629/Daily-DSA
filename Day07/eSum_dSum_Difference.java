import java.util.Scanner;

class eSum_dSum_Difference {
    public int differenceOfSum(int[] nums) {
        int eSum = 0;
        int dSum = 0;
        
        for (int i = 0; i < nums.length; i++){
            eSum += nums[i];

            int el = nums[i];
            while (el > 0){
                dSum += (el % 10);
                el = el/10;
            }
        }

        return Math.abs(eSum - dSum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        eSum_dSum_Difference obj = new eSum_dSum_Difference();
        int result = obj.differenceOfSum(nums);

        System.err.println(result);
    }
}