package JavaBasicCode;

import java.util.Arrays;

public class ArrayOf5Int {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for(int i=0;i<arr.length -1;i++){
            System.out.print(arr[i] +" ");
        }
        //System.out.println(Arrays.toString(arr));
        int max = arr[0];
        for (int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }
        System.out.println(max);
    }
}
