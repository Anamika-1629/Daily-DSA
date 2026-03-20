import java.util.Scanner;

class XORinArray {
    public int xorOperation(int n, int start) {
        int [] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = start+2*i;
        }

        int xor = start;
        for (int j = 1; j < n; j++){
            xor = xor^nums[j];
        }

        return xor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();

        XORinArray obj = new XORinArray();
        int res = obj.xorOperation(n, s);

        System.out.println("Result is "+res);
    }
}