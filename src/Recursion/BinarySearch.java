package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {23,5,90,21,67};
        int target = 0;
        int ans = search(arr,target,0,arr.length-1);
        System.out.println(ans);
    }
    static int search(int[] arr, int target, int start, int end){
        if(start > end) return -1;
        int mid = start + (end - start) / 2;
        if(arr[mid] == target) return mid;
        if(target < arr[mid]){
            search(arr, target, start, mid-1);
        }
        return search(arr, target, mid + 1, end);

    }
}
