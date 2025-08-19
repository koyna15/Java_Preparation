package RoughSolving;

import java.util.Arrays;

public class RotatedArrayR {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int r=1;
        rotate(arr,r);
        System.out.println(Arrays.toString(arr));
    }
    static void rotate(int[] arr,int r){
        reverse(arr,0,arr.length-1);
        reverse(arr,0,r-1);
        reverse(arr,r,arr.length-1);
    }
    static void reverse(int[] arr,int start,int end){
        //int start=0,end=arr.length-1;
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
