package Array;

public class LsAndReturnElement {
    public static void main(String[] args) {
        int[] arr = {12,34,45,56,78,9,67};
        int target = 67;
        int ans = linearSearch(arr,target);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int element : arr){
            if(element == target){
                return element;
            }
        }
        return -1;
    }
}
