package LeetCode;

import java.util.Arrays;

public class Q217 {
    class Solution {
        public boolean containsDuplicate(int[] nums) {
            //int num[] = new int[6];
            Arrays.sort(nums);
            for(int i=1;i<nums.length;i++){
                if(nums[i]==nums[i-1]){
                    return true;
                }

            }
            return false;




        }

    }
}
