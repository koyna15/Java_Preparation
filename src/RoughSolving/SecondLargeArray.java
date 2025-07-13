package RoughSolving;

public class SecondLargeArray {
    public static void main(String[] args) {
        int[] arr = {12,34,234,56,78,94};
        int max= Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int ans = large(arr,max,secondMax);
        System.out.println(ans);
    }
    static int large(int[] arr, int max, int secondMax){
        for (int element : arr) {
            if(element > max){
                secondMax = max;
                max = element;
            }
            else if(element > secondMax && element != max){
                secondMax = element;
            }
        }
        return secondMax;
    }
}
