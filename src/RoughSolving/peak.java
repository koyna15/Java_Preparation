package RoughSolving;

import java.util.Arrays;

public class peak {
    public static void main(String[] args) {
        int[] arr = {10, 20, 15, 2, 23, 90, 80 };
        int ans = peakElement(arr);
        System.out.println(ans);
    }
    public static int peakElement(int[] arr) {
        //Arrays.sort(arr);
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if( arr[i]>max){
                max = i;
            }
        }
//        System.out.println(max);
//        //System.out.println(Arrays.toString(arr));
        return max;
    }
}
