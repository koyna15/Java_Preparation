package Functions;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr = {1,3,4,45,6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0] =99;
    }
}
