package Array;

import java.util.Arrays;

public class SwapAlternateElements {
    public static void main(String[] args) {
        int[] arr = {9, 3, 6, 12, 4, 32};
        swapAlternate(arr);

    }
    public static void swapAlternate(int arr[]) {
        for(int i =0;i< arr.length - 1; i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
