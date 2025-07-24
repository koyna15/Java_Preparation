package GfG;

class SecondLargestwithD {
    public static void main(String[] args) {
        int[] arr = {10,10,10};
        int ans = getSecondLargest(arr);
        System.out.println(ans);
    }
    public static int getSecondLargest(int[] arr) {
        // code here
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int element : arr){
            if(element>max){
                secondMax = max;
                max = element;
            }
            else if(element > secondMax && element!=max){
                secondMax = element;
            }
            
        }
        if(secondMax == Integer.MIN_VALUE){
            return -1;
        }
        return secondMax;
    }
}