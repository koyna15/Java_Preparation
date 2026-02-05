package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int[] arr = {8,5,3,1,6,2};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        
    }
    static void mergeSort(int arr[], int l, int r) {

        if(l >= r) return;

        int m = l + (r - l) / 2;

        mergeSort(arr, l, m);
        mergeSort(arr, m+1, r);
        merge(arr, l , m, r);

    }
    static void merge(int[] arr, int l, int m, int r){

        int[] temp = new int[r-l+1];
        int i = l, j = m+1, k=0;

        while(i <= m && j <= r){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }
            else{
                temp[k++] = arr[j++];
            }
        }
        while(i <= m){
            temp[k++] = arr[i++];

        }
        while(j <= r){
            temp[k++] = arr[j++];

        }
        for(int p = 0; p < temp.length; p++) {
            arr[l + p] = temp[p];
        }
    }

}
