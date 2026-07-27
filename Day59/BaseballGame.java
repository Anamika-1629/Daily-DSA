import java.util.Scanner;
import java.util.Stack;

class Solution {

    public int calPoints(String[] operations) {

        Stack<Integer> st = new Stack<>();

        for (String op : operations) {

            if (op.equals("+")) {
                int top = st.pop();
                int sum = top + st.peek();
                st.push(top);
                st.push(sum);
            }

            else if (op.equals("D")) {
                st.push(2 * st.peek());
            }

            else if (op.equals("C")) {
                st.pop();
            }

            else {
                st.push(Integer.parseInt(op));
            }
        }

        int total = 0;

        while (!st.isEmpty()) {
            total += st.pop();
        }

        return total;
    }
}

public class BaseballGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of operations: ");
        int n = sc.nextInt();

        String[] operations = new String[n];

        System.out.println("Enter the operations:");

        for (int i = 0; i < n; i++) {
            operations[i] = sc.next();
        }

        Solution obj = new Solution();

        int ans = obj.calPoints(operations);

        System.out.println("Total Score = " + ans);

        sc.close();
    }
}