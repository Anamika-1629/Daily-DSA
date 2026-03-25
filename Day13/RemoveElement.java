import java.util.Scanner;

class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int n = nums.length;

        for(int i = 0; i < n; i++){
            if (nums[i] != val){
                nums[count] = nums[i]; //we are shifting the elements to the front, the remaining doesn't matter after the count end.
                count++;
            }
        }

        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] nums = new int[n];
        for (int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        int v = sc.nextInt();

        RemoveElement obj = new RemoveElement();
        int res = obj.removeElement(nums, v);

        System.out.println("Result is "+res);

        sc.close();
    }
}