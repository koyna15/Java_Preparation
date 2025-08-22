package Array;

import java.util.Arrays;

public class ZeroAtEnd {
    public static void main(String[] args) {
        //int[] arr = {1,0,3,0,5,0,7,0};
        int[] arr ={3,5,0,0,4};
        int start=0, end=arr.length - 1;
        while(start<=end){
            if(arr[end]==0){
                end--;
            }
            if(arr[start]!=0){
                start++;
            }
            if(arr[start]==0 && arr[end]!=0){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
