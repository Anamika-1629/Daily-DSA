import java.util.*;

/*
Copy both arrays into a new array/list and sort it
Time Complexity: O((n+m)log(n+m))
Space Complexity: O(n+m)
*/
class Solution{
    public double findMedianSortedArrays(int[] nums1, int[] nums2){
        List<Integer> merged = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            merged.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            merged.add(nums2[i]);
        }

        Collections.sort(merged);

        if (merged.size() % 2 != 0) {
            int med = merged.size() / 2;
            return merged.get(med);
        }

        int m1 = merged.size() / 2 - 1;
        int m2 = merged.size() / 2;

        return (merged.get(m1) + merged.get(m2)) / 2.0;
    }
}

public class MedianOfTwoSortedArray_MergeArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n1 = sc.nextInt();
        int[] nm1 = new int[n1];
        for (int i = 0; i < n1; i++) nm1[i] = sc.nextInt();

        int n2 = sc.nextInt();
        int[] nm2 = new int[n2];
        for (int i = 0; i < n2; i++) nm2[i] = sc.nextInt();

        Solution sol = new Solution();
        System.out.println(sol.findMedianSortedArrays(nm1, nm2));
        sc.close();
    }
}
