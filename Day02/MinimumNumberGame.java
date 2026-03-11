import java.util.*;

class MinimumNumberGame {
    public int[] numberGame(int[] nums) {

        int[] arr = new int[nums.length];

        ArrayList<Integer> num = new ArrayList<>();

        for (int x : nums) {
            num.add(x);
        }

        int index = 0;

        while (!num.isEmpty()) {

            int alice = min(num);
            num.remove(Integer.valueOf(alice));

            int bob = min(num);
            num.remove(Integer.valueOf(bob));

            arr[index++] = bob;
            arr[index++] = alice;
        }

        return arr;
    }

    static int min(ArrayList<Integer> lst) {

        int min = lst.get(0);

        for (int i = 1; i < lst.size(); i++) {
            if (lst.get(i) < min) {
                min = lst.get(i);
            }
        }

        return min;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();

        int[] nums = new int[len];

        for (int i = 0; i < len; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("Resultant Array:-");

        MinimumNumberGame obj = new MinimumNumberGame();
        System.out.println(Arrays.toString(obj.numberGame(nums)));

        sc.close();
    }
}