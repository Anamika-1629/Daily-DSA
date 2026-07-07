import java.util.Scanner;

/*
Merge the arrays like Merge Sort, but don't actually store all elements
Time Complexity: O(n+m)
Space Complexity: O(1) 
*/
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n1 = nums1.length;
        int n2 = nums2.length;
        int total = n1 + n2;

        int i = 0, j = 0;
        int count = 0;

        int prev = 0, curr = 0;

        while (i < n1 || j < n2) {

            prev = curr;

            if (i < n1 && (j >= n2 || nums1[i] <= nums2[j])) {
                curr = nums1[i];
                i++;
            } else {
                curr = nums2[j];
                j++;
            }

            if (count == total / 2) {
                if (total % 2 == 0) {
                    return (prev + curr) / 2.0;
                } else {
                    return curr;
                }
            }

            count++;
        }

        return 0.0;
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
