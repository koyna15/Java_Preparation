package RoughSolving;

import java.util.Arrays;

public class SelSort {
    public static void main(String[] args) {
        int[] arr = {3,1,4,5,2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                int last = arr.length - i -1;
                int maxIn = getMaxIn(arr,0,last);
                swap(arr,maxIn,last);
            }
        }
    }
    static int getMaxIn(int[] arr, int start, int end){
        int max = start;
        for (int i = 0; i <= end; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
