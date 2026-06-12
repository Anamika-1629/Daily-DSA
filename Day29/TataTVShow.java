import java.util.Scanner;

public class TataTVShow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++){
            int n = sc.nextInt();
            int k = sc.nextInt();

            String s = sc.next();

            TataTVShow obj = new TataTVShow();
            System.out.println(obj.makeZero(n, k, s));
        }
        sc.close();
    }
    
    public String makeZero(int n, int k, String s){

        for (int i = 0; i < k; i++){
            int count = 0;
            
            for (int j = i; j < n; j+=k){
                if (s.charAt(j) == '1'){
                    count++;
                }
            }

            if (count % 2 != 0) return "NO";
        }
        return "YES";
    }
}

