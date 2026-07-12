package TwoPointer;

import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {1,2,0,3,4,5};
        int ans = countSum(arr, 7);
        System.out.println(ans);

    }
    static int countSum(int[] arr, int target){

        Arrays.sort(arr);
        int count = 0;

        for(int i = 0; i < arr.length - 2; i++){

            int left = i+1, right = arr.length - 1;

            while(left < right){

                int sum = arr[i] + arr[left] + arr[right];

                if(sum == target){
                    count++;
                    left++;
                    right--;
                }
                else if(sum > target){
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return count;
    }
}
