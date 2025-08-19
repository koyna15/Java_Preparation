package RoughSolving;

public class ReA {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,5,5};
        int k=1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i-1]) {
                arr[k] = arr[i];
                k++;
            }
        }
        System.out.println(k);
    }
}
