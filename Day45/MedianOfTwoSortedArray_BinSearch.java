import java.util.*;

/*
Partition the arrays using binary search
Time Complexity - O(log(min(n,m)))
Space Complexity - O(1)
*/
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        // Always binary search on the smaller array
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int n1 = nums1.length;
        int n2 = nums2.length;

        int low = 0;
        int high = n1;

        while (low <= high) {

            // Partition in nums1
            int partition1 = (low + high) / 2;

            // Partition in nums2
            int partition2 = (n1 + n2 + 1) / 2 - partition1;

            // Left and right values around the partitions
            int left1 = (partition1 == 0) ? Integer.MIN_VALUE : nums1[partition1 - 1];
            int right1 = (partition1 == n1) ? Integer.MAX_VALUE : nums1[partition1];

            int left2 = (partition2 == 0) ? Integer.MIN_VALUE : nums2[partition2 - 1];
            int right2 = (partition2 == n2) ? Integer.MAX_VALUE : nums2[partition2];

            // Correct partition found
            if (left1 <= right2 && left2 <= right1) {

                // Even number of elements
                if ((n1 + n2) % 2 == 0) {
                    return (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0;
                }

                // Odd number of elements
                return Math.max(left1, left2);
            }

            // Move left
            else if (left1 > right2) {
                high = partition1 - 1;
            }

            // Move right
            else {
                low = partition1 + 1;
            }
        }

        return 0.0; // Never reached
    }
}

public class MedianOfTwoSortedArray_TwoPointers {
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
