package Array;

public class Sum {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,9,5};
        int sum1=0;
        int sum2=0;

        for (int i = 0; i < arr.length/2; i++) {
            sum1+=arr[i];
        }
        System.out.println(sum1);
        for (int i = arr.length/2; i < arr.length; i++) {
            sum2+=arr[i];
        }
        System.out.println(sum2);
        System.out.println(Math.abs(sum1-sum2));
    }

}
