package Array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;

        twoSum(arr,target);
        int[] ansHash = twoSumHash(arr, target);
        System.out.println(Arrays.toString(ansHash));
    }
    static void twoSum(int[] arr, int target){
        int start = 0, end = arr.length-1;
        while(start<end){
            int sum = arr[start] + arr[end];
            if(sum == target){
                System.out.println(start +" "+end);
                return;
            }
            else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }
    }
    static int[] twoSumHash(int[] arr, int target){ // Using HashMap
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            int diff = target - arr[i];

            if(map.containsKey(diff)){
                return new int[]{map.get(diff), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{};
    }
}
