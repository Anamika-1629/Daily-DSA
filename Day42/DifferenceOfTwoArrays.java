import java.util.*;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) set1.add(num);
        for (int num : nums2) set2.add(num);

        Set<Integer> only1 = new HashSet<>(set1);
        Set<Integer> only2 = new HashSet<>(set2);

        only1.removeAll(set2);
        only2.removeAll(set1);

        return Arrays.asList(new ArrayList<>(only1), new ArrayList<>(only2));
    }
}

public class DifferenceOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] num1 = new int[n1];
        for (int i = 0; i < n1; i++)
            num1[i] = sc.nextInt();

        int n2 = sc.nextInt();
        int[] num2 = new int[n2];
        for (int i = 0; i < n2; i++)
            num2[i] = sc.nextInt();

        Solution sol = new Solution();
        List<List<Integer>> result = sol.findDifference(num1, num2);

        System.out.println(result);

        sc.close();
    }
}