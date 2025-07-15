package JavaBasicCode;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,1,4};
        int target = 8;
        //int ans = twoSum(arr,target);
        twoSum(arr,target);

    }
    static void twoSum(int[] arr,int target){
        for(int i = 0;i<arr.length;i++){
            for (int j = i+1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if(sum == target){
                    System.out.println(i +" " +j);
                }
            }
        }
    }
}
