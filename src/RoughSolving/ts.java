package RoughSolving;

public class ts {
    public static void main(String[] args) {
        int[] arr = {2,7,1,4};
        int target = 8;
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
