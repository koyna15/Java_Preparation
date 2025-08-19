package RoughSolving;
//
public class bs {
    public static void main(String[] args) {
        int[] arr = {10,8,30,40,5};
        int target = 5;
        int start=0,end= arr.length - 1;

        while(start<=end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid + 1;
            }
            else{
                System.out.println(mid);
                break;
            }
        }
//
//
//        int[] arr = {2,3,5,9,14,16,18};
//        int target = 6;
//        int ans = floor(arr,target);
//        System.out.println(ans);
//    }
//
//    static int floor(int[] arr, int target){
//        int max  = Integer.MAX_VALUE;
//        int start = 0,end = arr.length - 1;
//        while(start<=end){
//            int mid = start + (end - start) / 2;
//            if(target > arr[mid]){
//                start = mid + 1;
//            }
//            else if(target < arr[mid]){
//                end = mid - 1;
//            }
//            else{
//                return mid;
//            }
//        }
//        return end;
    }
}

