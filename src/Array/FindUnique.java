package Array;

import java.util.Arrays;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 6, 3, 6, 2};
        int ans = findUnique(arr);
        System.out.println(ans);
    }
    public static int findUnique(int[] arr){

        Arrays.sort(arr);
        int i=0;
        while(i < arr.length - 1){
            if(arr[i] == arr[i+1]){
                i+=2;
            }
            else{
                return arr[i];
            }
        }
        return arr[arr.length - 1];
    }
}
