import java.util.*;

class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;        
        int j = n - 1;        
        int k = m + n - 1;    

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // If nums2 still has elements
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] n1 = new int[m+n];
        for (int i = 0; i < m; i++){
            n1[i] = sc.nextInt();
        }
        int[] n2 = new int[n];
        for (int i = 0; i < n; i++){
            n2[i] = sc.nextInt();
        }

        MergeSortedArray obj = new MergeSortedArray();
        obj.merge(n1, m, n2, n);

        for (int num : n1){
            System.out.println(num+" ");
        }

        sc.close();
        
    }
}