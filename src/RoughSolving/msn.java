package RoughSolving;

import java.util.Arrays;

public class msn {
    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 5, 3, 7, 1};
        int ans = missingNum(arr);
        System.out.println(ans);
    }
    static int missingNum(int[] arr) {
        int i=0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i]< arr.length && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }

        }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]!= index +1){
                return index + 1;
            }
        }
        return arr.length-1;
    }
    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

}
