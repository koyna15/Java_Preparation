package LeetCode;

import java.util.Arrays;

public class Q73 {
    public static void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean[] rowZero = new boolean[rows];
        boolean[] colZero = new boolean[cols];

        // Step 1: Store the row and column index of elements that are 0
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    rowZero[i] = true;
                    colZero[j] = true;
                }
            }
        }

        // Step 2: Set matrix[i][j] to 0 if i-th row or j-th column has 0
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (rowZero[i] || colZero[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 0, 6},
                {7, 8, 9}
        };

        System.out.println("Before:");
        printMatrix(matrix);

        setZeroes(matrix);

        System.out.println("After:");
        printMatrix(matrix);
    }
}
