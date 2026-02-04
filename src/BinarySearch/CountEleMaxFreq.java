package BinarySearch;

import java.util.HashMap;

class CountEleMaxFreq {
    public static void main(String[] args) {
        int[] nums = {1,2,2,1,3,5};
        int ans = maxFrequencyElements(nums);
        System.out.println(ans);
    }
    public static int maxFrequencyElements(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x : nums){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        int max = Integer.MIN_VALUE;

        for(int val : map.values()){

            if(val > max){
                max = val;
            }
        }

        int sum = 0;
        for(int key : map.keySet()){
            if(map.get(key) == max){
                sum += max;
            }
        }

        return sum;
    }
}