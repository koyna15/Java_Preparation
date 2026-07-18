package String;

import java.util.Arrays;

public class FirstAndLastPos {
    public static void main(String[] args) {
        int[] arr =  {5, 7, 7, 8, 8, 9};
        int target = 8;
        int sum = Arrays.stream(arr).sum();
        Arrays.stream(arr).filter(i -> i % 2 == 1).map(i -> i * 2).forEach(System.out::println);
        int[] ans = Arrays.stream(arr).distinct().toArray();
        System.out.println(Arrays.toString(ans));
        System.out.println();
        System.out.println(sum);
        System.out.println(Arrays.toString(searchRange(arr,target)));
    }

    public static int[] searchRange(int[] nums, int target){
        StringBuilder sb = new StringBuilder();

        for(int x : nums){
            sb.append(x);
        }

        int[] ans = new int[2];
        ans[0] = sb.indexOf(String.valueOf(target));
        ans[1] = sb.lastIndexOf(String.valueOf(target));

        return ans;
    }
}
