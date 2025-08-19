package LeetCode;

import java.util.Arrays;

public class Q34 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] ans1 = searchRange(nums,target);
        System.out.println(Arrays.toString(ans1));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans  = {-1,-1};
        //check for the first occurrence if target first
        int start = search(nums,target,true);
        int end = search(nums,target,false);

        ans[0] = start;
        ans[1] =end;

        return ans;
    }
    //this fun just return index value of target.
    static int search(int[] nums,int target, boolean findStartIndex) {
        int ans = -1;
        //check for the first occurrence if target first
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
