package LeetCode;

public class Q81 {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,1};
        boolean ans = search(arr,0);
        System.out.println(ans);
    }
    public static boolean search(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start) / 2;
            if(target == arr[mid]){
                return true;
            }
            if(arr[start] == arr[mid] && arr[mid] == arr[end]){
                start++;
                end--;
            }
            else if(arr[start] <= arr[mid]){
                if(arr[start] <= target && target <= arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(arr[mid] <= target && target <= arr[end]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return false;
    }
}
