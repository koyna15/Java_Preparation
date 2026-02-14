package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayDuplicates {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 3};
        ArrayList<Integer> ans = findDuplicates(arr);
        System.out.println(ans);
    }
    public static ArrayList<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=1;i<n;i++){
            if(arr[i] == arr[i-1]){
                result.add(arr[i]);
                while(i+1<n && arr[i] == arr[i+1]){
                    i++;
                }
            }
        }
        return result;
    }
}
