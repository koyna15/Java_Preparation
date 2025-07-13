package Array;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12,4,56,78,5,9,6,45,34};
        int target=34;
        int ans = linearSearch(arr,target);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int index =0;index<arr.length;index++){
            int element = arr[index];
            if(element==target){
                return index;
            }
        }
        return -1;
    }
}
