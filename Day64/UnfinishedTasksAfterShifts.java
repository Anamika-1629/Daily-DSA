import java.util.*;

class Solution {
    public int[] countTasks(int[] tasks, int[] shifts) {
        int[] ans = new int[shifts.length];

        //find total work and prefix sum
        long total = 0;
        long[] pre = new long[tasks.length];
        for (int i = 0; i < tasks.length; i++){
            total += tasks[i];
            pre[i] = total;
        } 

        
        long curr = 0; int idx = 0;
        for (int i = 0; i < shifts.length; i++){
            curr += shifts[i];

            if (curr >= total){
                ans[i] = 0;
                curr = 0;
            }
            else {
                idx = up(pre, curr);
                ans[i] = tasks.length - idx;
            }
            
        }
        
        return ans;
    }
    private int up(long[] pre, long curr){
        int l = 0; int r = pre.length;

        while (l < r){
            int mid = l+(r-l)/2;

            if (pre[mid] <= curr) l = mid+1;
            else r = mid;
        }

        return l;
    }
}

public class UnfinishedTasksAfterShifts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] tasks = new int[t];

        int s = sc.nextInt();
        int[] shifts = new int[s];

        Solution sol = new Solution();
        System.out.println(sol.countTasks(tasks, shifts));
        sc.close();
    }    
}
