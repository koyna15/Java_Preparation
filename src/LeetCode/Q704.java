package LeetCode;

public class Q704 {
    public static void main(String[] args) {
        int[] arr ={-1,0,3,5,9,12};
        int target = 9;
        int ans = search(arr,target);
        System.out.println(ans);
    }
    public static int search(int[] arr, int target) {
        return helper(arr,target,0,arr.length-1);
    }
    public static int helper(int[] arr, int target,int s, int e){
        if(s>e){
            return -1;
        }
        int mid = s + (e-s) / 2;
        if(target == arr[mid]){
            return mid;
        }
        if(target < arr[mid]){
            return helper(arr,target,s,mid-1);
        }
        return helper(arr,target,mid+1,e);

    }
}
