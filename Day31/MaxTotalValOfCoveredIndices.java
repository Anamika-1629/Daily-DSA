import java.util.Scanner;

class Solution {
    public long maxTotal(int[] nums, String s) {
        long ans = 0;
        int n = nums.length;
        int i = 0;

        while (i < n){
            if (s.charAt(i) == '0'){
                i++;
                continue;
            }

            int l = i; //initialise the starting index of the block of 1's

            while (i < n && s.charAt(i) == '1'){
                i++;
            }

            int r = i-1; //get the ending index of the block

            long sum = 0; 

            //if l = 0, we dont have any i-1 to operate, so starting will be from l
            //otherwise, we have to consider i-1 also
            int st = 0;
            if (l > 0){
                st = l-1;
            }
            else{
                st = l;
            }

            //store the minimum value from the whole block
            int minVal = Integer.MAX_VALUE; 

            for (int j = st; j <= r; j++){
                sum += nums[j];
                minVal = Math.min(minVal, nums[j]);
            }

            //if l > 0, i-1 is considered --> ans will be the sum exculding minimum val
            if (l > 0){
                ans += sum-minVal;
            }
            //no i-1, no minVal to consider
            else{
                ans += sum;
            }
        }

        return ans;
        
    }
}

public class MaxTotalValOfCoveredIndices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nm = new int[n];

        for (int i = 0; i < n; i++){
            nm[i] = sc.nextInt();
        }

        String s = sc.next();

        Solution obj = new Solution();
        System.out.println(obj.maxTotal(nm, s));
        sc.close();
    }    
}
