package LinearSearch;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {18,12,-7,3,24,28};
        System.out.println(min(arr));
    }
    static  int min(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}
