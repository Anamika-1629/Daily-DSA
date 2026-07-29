import java.util.Scanner;

class SolutionI_BruteForce {
    public int nthUglyNumber(int n) {
        int[] vals = new int[n];
        int i = 1;
        int idx = 0;

        while (idx < n){
            if (isUgly(i)) {
                vals[idx] = i;
                idx++;
            }
            i++;
        }

        return vals[n-1];
        
    }

    //to check if the number is ugly
    private boolean isUgly (int n){
        while (n%2 == 0) n /= 2;
        while (n%3 == 0) n /= 3;
        while (n%5 == 0) n /= 5;

        if (n == 1) return true;
        else return false;
    }
}

class SolutionII_ThreePointers {
    public int nthUglyNumber(int n) {
        int[] vals = new int[n];
        vals[0] = 1;

        int idx = 1;
        int i2 = 0; int i3 = 0; int i5 = 0; //refers to the 0th index of vals

        while (idx < n){
            //get all possible next values
            int p1 = vals[i2]*2;
            int p2 = vals[i3]*3;
            int p3 = vals[i5]*5;

            //insert only the minimum value of 3 in the value array
            int min = Math.min(p3, Math.min(p1,p2));
            vals[idx] = min;

            //increment the pointer for the minimum value only
            if (min == p1) i2++;
            if (min == p2) i3++;
            if (min == p3) i5++;

            idx++;

        }

        return vals[n-1];
    }
}

public class UglyNumberII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        SolutionI_BruteForce s1 = new SolutionI_BruteForce();
        System.out.println("Brute Force Solution:- "+n+"th ugly number is "+s1.nthUglyNumber(n));

        SolutionII_ThreePointers s2 = new SolutionII_ThreePointers();
        System.out.println("Three Pointers Solution:- "+n+"th ugly number is "+s2.nthUglyNumber(n));

        sc.close();
    }
}
