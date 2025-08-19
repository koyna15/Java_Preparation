package RoughSolving;

import java.util.Arrays;

public class mergearray {
    public static void main(String[] args) {
        int[]  nums1 = {};
        int[] nums2 = {1};
        int m = 0,n=1;
        merge(nums1,m,nums2,n);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        int i=0,j=0,k=0;
//        //int[] nums3 = new int[m+n];
//        while(i<m && j<n){
//            if(nums1[i] < nums2[j]){
//                nums1[k++] = nums1[i++];
//            }
//            else{
//                nums1[k++] = nums2[j++];
//            }
//        }
//        while(i<m){
//            nums1[k++] = nums1[i++];
//        }
//        while(j<n){
//            nums1[k++] = nums2[j++];
//        }
//        System.out.println(Arrays.toString(nums1));
//    }
        int i = m - 1;       // Pointer for nums1
        int j = n - 1;       // Pointer for nums2
        int k = m + n - 1;   // Pointer for nums1 from the end

        // Merge nums1 and nums2 from the back
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // If any elements left in nums2, copy them
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}
