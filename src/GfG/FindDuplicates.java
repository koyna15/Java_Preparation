package GfG;

import java.util.ArrayList;
import java.util.Arrays;

class FindDuplicates {
    public static void main(String[] args) {
        int[] arr ={2, 3, 1, 2, 3};
        ArrayList<Integer> ans = findDuplicates(arr);
        System.out.println(ans);
    }
    public static ArrayList<Integer> findDuplicates(int[] arr) {
        int i=0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }

        ArrayList<Integer> duplicates = new ArrayList<>();
        int k=0;
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j+1){
                duplicates.add(arr[j]);
            }
        }
        return duplicates;
    }
    static void swap(int[] arr,int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}