package BinarySearch;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        int ans = ceiling(arr,target);
        System.out.println(ans);
    }
    //return the index of smallest no>= target
    static int ceiling(int[] letters, int target){
        if(target > letters.length - 1){
            return -1;
        }
        int start = 0;
        int end = letters.length-1;

        while(start<=end){
            //int mid = (start + end ) / 2;
            //int has fixed size,after some amount of value it will not true,
            //might be possible that (start + end)/2 together it might exceed range.
            int mid = start + (end - start) / 2;
            if(target<letters[mid]){
                end = mid-1;
            }
            else if(target > letters[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return start;
    }
}
