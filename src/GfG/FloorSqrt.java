package GfG;

public class FloorSqrt{
    public static void main(String[] args) {
        int ans = floorSqrt(11);
        System.out.println(ans);
    }
    static int floorSqrt(int n) {
        long low = 0;
        long high = n;
        long ans = 0;
        while(low<=high){
            long mid = low + (high - low) / 2;
            if(n==0){
                return 0;
            }
            if(n==1) return 1;
            if(mid * mid  == n){
                return (int)mid;
            }
            if(mid * mid < n){
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid - 1;
            }
        }
        return (int) ans;
    }
}
