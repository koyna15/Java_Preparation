package LeetCode;

public class Q80 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};

        int ans = removeDuplicates(nums);
        System.out.println(ans);
    }
    public static int removeDuplicates(int[] nums) {
        int k = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[k - 2]) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}
