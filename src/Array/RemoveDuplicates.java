package Array;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3};
        int n = arr.length;
        int[] fresh = new int[n];
        int k=0;
        fresh[k++]=arr[0];
         for(int i=1;i<n;i++){
             if(arr[i]!=arr[i-1]){
                 fresh[k++]=arr[i];
             }
         }
//         for(int i=0;i<k;i++){
//             System.out.print(fresh[i] +" ");
//         }
        System.out.println(Arrays.toString(Arrays.copyOf(fresh,k)));
    }
}
