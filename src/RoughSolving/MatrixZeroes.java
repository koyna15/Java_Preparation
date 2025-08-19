package RoughSolving;

import java.util.Arrays;

public class MatrixZeroes {
    public static void main(String[] args) {
        int[][] arr = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };
       setZeroes(arr);
        //System.out.println();
    }
    static void setZeroes(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;
        boolean[] rowZero = new boolean[row];
        boolean[] colZero = new boolean[col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(arr[i][j]==0){
                    rowZero[i] = true;
                    colZero[j] = true;
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (rowZero[i] || colZero[j]) {
                    arr[i][j] = 0;
                }
            }
        }
        for (int[] rows : arr) {
            System.out.println(Arrays.toString(rows));
        }
    }
}
