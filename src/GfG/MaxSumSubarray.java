package GfG;

public class MaxSumSubarray {
    public static void main(String[] args) {
        int[] arr = {100, 200, 300, 400};

        int ans = maxSubarraySum(arr,2);
        System.out.println(ans);

    }

    public static int maxSubarraySum(int[] arr, int k){

        int windowSum = 0;

        for(int i=0; i<k; i++){
            windowSum+=arr[i];
        }

        int maxSum = windowSum;

        for(int i = k; i<arr.length; i++){
            windowSum = windowSum - arr[i-k] + arr[i];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}
