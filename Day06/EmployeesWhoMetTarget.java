
import java.util.Scanner;

class EmployeesWhoMetTarget {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int n = hours.length;
        int count = 0;

        for (int i = 0; i < n; i++){
            if ((hours[i] == target) || (hours[i] > target)){
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] hrs = new int[n];
        for (int i = 0; i < n; i++){
            hrs[i] = sc.nextInt();
        }

        int t = sc.nextInt();

        EmployeesWhoMetTarget obj = new EmployeesWhoMetTarget();
        int result = obj.numberOfEmployeesWhoMetTarget(hrs, t);

        System.err.println("Result is "+result);
        sc.close();
    }
}