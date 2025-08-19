package RoughSolving;

import java.util.Arrays;

public class zeros {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        int start=0,end=nums.length-1;
        while(start<end){
            if(nums[end] ==0){
                end--;
            }
//            if(nums[start]!=0){
//                start++;
//            }
//            if(nums[start]==0 && nums[end] !=0){
//                int temp = nums[start];
//                nums[start] = nums[end];
//                nums[end] = temp;
//                start++;
//                end--;
//            }
            if(nums[start]==0){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }

        }
        System.out.println(Arrays.toString(nums));
//        int n=nums.length,count=0;
//        int[] arr = new int[n];
//        for(int num: nums){
//            if(num ==0){
//                arr[count++] = num;
//
//            }
//        }

        System.out.println(Arrays.toString(nums));
    }
}
