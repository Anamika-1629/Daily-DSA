import java.util.*;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() &&
                   temperatures[i] > temperatures[stack.peek()]) {

                int prev = stack.pop();
                ans[prev] = i - prev;
            }

            stack.push(i);
        }

        return ans;
    }
}

public class DailyTemperatures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] temp = new int[t];
        for (int i = 0; i < t; i++) temp[i] = sc.nextInt();

        Solution sol = new Solution();
        int[] res = sol.dailyTemperatures(temp);
        for (int i: res) System.out.println(i);
        sc.close();
    }    
}
