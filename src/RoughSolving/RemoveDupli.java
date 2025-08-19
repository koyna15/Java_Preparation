package RoughSolving;

import java.util.Arrays;

public class RemoveDupli {
    public static void main(String[] args) {
//        int [] arr = {0,0,1,1,1,2,2,3,3,4};
        int[] arr = {1, 2, 3, 4, 5};
        int k=1;
        rotate(arr,k);
        System.out.println(Arrays.toString(arr));
//        int n = arr.length;
//        int[] fresh = new int[n];
//        int k=0;
//        fresh[k++] = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if(arr[i]!=arr[i-1]){
//                fresh[k++]=arr[i];
//            }
//        }
//        System.out.println(Arrays.toString(Arrays.copyOf(fresh,k)));


    }
    public static void rotate(int[] arr,int k) {
//        int k=1;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);

    }
    static void reverse(int[] arr, int start, int end){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
}
