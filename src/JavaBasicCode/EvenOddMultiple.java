package JavaBasicCode;

public class EvenOddMultiple {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        multiple(arr);
    }
    static void multiple(int[] arr){
        int evenMul=1;
        int oddMul=1;
        int start=0;
        while(start < arr.length){
            if(start%2==0){
                evenMul*=arr[start];
            }
            else{
                oddMul*=arr[start];
            }
            start++;

        }
        System.out.println(evenMul);
        System.out.println(oddMul);

    }
}
