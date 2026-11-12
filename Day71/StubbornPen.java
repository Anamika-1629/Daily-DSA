import java.util.*;
 
public class StubbornPen{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for (int j = 0; j < t; j++){
            int n = sc.nextInt();
            String s = sc.next();
            
            System.out.println(findManualCounts(n,s));
        }
    }
    
    public static int findManualCounts(int n, String s){
        int count = 0;
        
        if (s.charAt(0) != 'R') count++; 
        for (int i = 0; i < n-1; i++){
            if (s.charAt(i) == s.charAt(i+1)) count++;
        }
        
        return count;
    }
}