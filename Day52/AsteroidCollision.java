import java.util.Scanner;
import java.util.Stack;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> st = new Stack<>();

        for (int asteroid : asteroids) {

            boolean des = false;

            while (!st.isEmpty() && asteroid < 0 && st.peek() > 0) {

                if (st.peek() < -asteroid) {
                    st.pop();                
                }
                else if (st.peek() == -asteroid) {
                    st.pop();               
                    des = true;
                    break;
                }
                else {
                    des = true;       
                    break;
                }
            }

            if (!des) {
                st.push(asteroid);
            }
        }

        int[] ans = new int[st.size()];

        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }

        return ans;
    }
}

public class AsteroidCollision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ast = new int[n];
        for (int i = 0; i< n; i++) ast[i] = sc.nextInt();

        Solution sol = new Solution();
        int[] ans = sol.asteroidCollision(ast);
        for (int i : ans) System.out.println(i+" ");
        sc.close();
    }    
}
