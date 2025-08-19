package RoughSolving;

public class Ls {
    public static void main(String[] args) {
//        int[] arr = {1,13,45,63,87,33,24};
//        int target = 13;
//        int ans = linearSearch(arr,target);
//        System.out.println(ans);
//    }
//    static int linearSearch(int[] arr, int target){
//        if(arr.length == 0){
//            return -1;
//        }
//        for (int index = 0; index < arr.length; index++) {
//            int element = arr[index];
//            if(element == target){
//                return element;
//            }
//        }
//        return -1;

        int[] arr = {13,2,45,36,58,89};
        int target = 89;
        int ans = linearSearch(arr,target);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if(element == target){
                return element;
            }
        }

        return -1;
    }
}
