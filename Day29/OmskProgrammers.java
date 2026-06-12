
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OmskProgrammers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();

            OmskProgrammers obj = new OmskProgrammers();
            System.out.println(obj.minOperators(a, b, x));
        }
        sc.close();
    }
    
    public int minOperators(int a, int b, int x){
        if (a == b){
            return 0;
        }

        int ans = Math.abs(a-b);

        List <Integer> divA = new ArrayList<>();
        List <Integer> costA = new ArrayList<>();
        int temp = a; int i = 0;
        while (true){
            divA.add(temp); costA.add(i);

            if (temp == 0) break;

            temp /= x; i++;
        }

        List <Integer> divB = new ArrayList<>();
        List <Integer> costB = new ArrayList<>();
        int temp2 = b; int j = 0;
        while (true){
            divB.add(temp2); costB.add(j);
            
            if (temp2 == 0) break;

            temp2 /= x; j++;
        }

        for (int p = 0; p < divA.size(); p++){
            for (int q = 0; q < divB.size(); q++){
                int cost = costA.get(p) + costB.get(q) + Math.abs(divA.get(p) - divB.get(q));
                
                ans = Math.min(ans, cost);
            }
        }

        return ans;
    }
}
