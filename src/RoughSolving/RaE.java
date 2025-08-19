package RoughSolving;

public class RaE {
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        int ans= removeD(arr);
        System.out.println(ans);

    }
    static int removeD(int[] arr){
        if(arr.length == 0) return 0;
        int k=1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i-1]){
                arr[k] = arr[i];
                k++;
            }
        }
        return k;
    }
}
