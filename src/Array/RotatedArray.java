package Array;

import java.util.Arrays;

public class RotatedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Rotate(arr, 3);
        System.out.println(Arrays.toString(arr));
    }

    private static void Rotate(int[] arr, int r) {
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, r - 1);
        reverse(arr, r, arr.length - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}