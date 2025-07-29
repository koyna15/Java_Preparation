package RoughSolving;

public class Max2D {
    public static void main(String[] args) {
        int[][] arr = {
                {3,65},
                {75,38},
                {993,45}
        };
        int ans = search(arr);
        System.out.println(ans);
    }
    static int search(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] > max){
                    max = arr[i][j];
                }

            }
        }
        return max;
    }
}
