package Array;

public class ReturnBoolean {
    public static void main(String[] args) {
        int[] arr = {14,21,46,5,56,64,3};
        int target = 46;
        boolean ans = linearSearch(arr,target);
        System.out.println(ans);
    }
    static boolean linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return false;
        }
        for(int element : arr) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }
}
