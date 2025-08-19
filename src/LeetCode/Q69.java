package LeetCode;

public class Q69 {
    public static void main(String[] args) {
        int ans = mySqrt(8);
        System.out.println(ans);
    }
    static int mySqrt(int x){
        if(x==0){
            return 0;
        }
        if(x==1){
            return 1;
        }
        long start=0;
        long end=x;
        long ans=0;

        while(start<=end){
            long mid = start +(end - start) / 2;
            if(mid * mid == x){
                return (int)mid;
            }
            else if(mid * mid < x){
                ans = mid;
                start = mid+1;
            }
            else{
                end = mid -1;
            }
        }
        return (int) ans;
    }
}
