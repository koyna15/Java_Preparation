package RoughSolving;

public class rValE {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        //int val = 3;
        //int ans = removeElement(nums,val);
        int ans = removeDuplicates(nums);
        System.out.println(ans);
    }
//    public static int removeElement(int[] nums, int val) {
//        int k = 0;
//        for(int i =0;i<nums.length;i++){
//            if(nums[i] == val){
//                nums[k] = nums[i];
//                k++;
//            }
//        }
//        return k;
//    }

    public static int removeDuplicates(int[] nums) {
        int k =2;
        for (int i = 2; i < nums.length; i++) {
            if(nums[i] != nums[k-2] ){
                nums[k++] = nums[i];
            }
        }
        return k;
    }

}
