package JavaBasicCode;

public class Sqrt {
    public static void main(String[] args) {
        int ans = mySqrt(36);
        System.out.println(ans);
    }
    static int mySqrt(int x){
        long low=0;
        long high=x;
        long ans=0;

        while(low<=high){
            long mid = low + (high - low) / 2;
            if(x==0){
                return 0;
            }
            if(x==1){
                return 1;
            }
            if(mid * mid == x){
                return (int)mid;
            }
            else if(mid * mid < x){
                ans = mid;
                low = mid +1;
            }
            else{
                high = mid-1;
            }
        }
        return (int) ans;
    }
}
