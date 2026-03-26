import java.util.Scanner;

class TriangleTypes {
    public String triangleType(int[] nums) {
        
        int a = nums[0], b = nums[1], c = nums[2];

        if (a + b <= c || b + c <= a || a + c <= b) {
            return "none";
        }

        if (a == b && b == c) {
            return "equilateral";
        }

        if (a != b && b != c && a != c) {
            return "scalene";
        }

        return "isosceles";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int [] nums = new int[n];

        for(int x = 0; x < n; x++){
            nums[x] = sc.nextInt();
        }

        TriangleTypes obj = new TriangleTypes();
        String result = obj.triangleTypes(nums);

        System.out.println("Result is "+result);
        sc.close();
    }
}