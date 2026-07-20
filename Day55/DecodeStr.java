import java.util.*;

class Solution {
    public String decodeString(String s) {
        int n = s.length();

        String ans = "";
        
        Stack <Integer> num = new Stack<>();
        Stack <StringBuilder> chars = new Stack<>();

        int no = 0;
        StringBuilder curr = new StringBuilder();

        for (int i = 0; i < n; i++){
            char ch = s.charAt(i);
            
            //build the number
            if (Character.isDigit(ch)){
                no = no*10 + (ch-'0');
            }

            //push number into num stk, reset number
            //push curr into chars stk, make it empty
            else if (ch == '[') {
                num.push(no);
                no = 0;

                chars.push(curr);
                curr = new StringBuilder();
            }

            //build the string
            else if (Character.isLetter(ch)){
                curr.append(ch);
            }

            //pop the number -> repeating number 
            //pop Stringbuilder -> append curr to it for d no of times
            //assign the build repeated str to curr
            else {
                int d = num.pop();
                StringBuilder str = chars.pop();

                for (int j = 0; j < d; j++){
                    str.append(curr);
                }

                curr = str;
            }
        }

        return curr.toString();
        
    }
}

public class DecodeStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        Solution obj = new Solution();
        System.out.println(obj.decodeString(s));

        sc.close();
    }    
}
