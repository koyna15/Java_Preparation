//package RoughSolving;
//
//public class g1 {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 5};
//        int ans = missingNum(arr);
//        System.out.println(ans);
//    }
//    static int missingNum(int arr[]) {
//        int i=0;
//        while(i< arr.length){
//            int correct = arr[i];
//            if(arr[i]!= correct){
//                swap(arr,i,correct);
//            }
//            else{
//                i++;
//            }
//        }
//    }
//    static void swap(int[] arr, int first,int second){
//        int temp=arr[first];
//        arr[first]=arr[second];
//        arr[second]=temp;
//    }
//}
