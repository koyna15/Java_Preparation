package LinearSearch;

import java.util.Arrays;

public class MaxIn2D {
    public static void main(String[] args) {
        int[][] arr = {
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12}
        };
        int target = 34;
         
        System.out.println(max(arr));
    }
    static int max(int[][] arr){
        int max= Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element ;
                }
            }
        }
        return max;
    }
}
