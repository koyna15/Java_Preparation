package RoughSolving;

class Sqrt {
    public static void main(String[] args) {
        int ans = mySqrt(49);
        System.out.println(ans);
    }
//    public static int mySqrt(int x) {
//        if (x == 0) {
//            return 0;
//        }
//        if (x == 1) {
//            return 1;
//        }
//        long low = 0;
//        long high = x;
//        long ans = 0;
//
//        while (low <= high) {
//            long mid = low + (high - low) / 2;
//
//            if (mid * mid == x) {
//                return (int) mid;
//            } else if (mid * mid < x) {
//                ans = mid;
//                low = mid + 1;
//            } else {
//                high = mid - 1;
//            }
//        }
//        return (int) ans;
//    }


    static int mySqrt(int n){
        int start = 0;
        int end = n;
        int ans=0;

        while(start<=end){
            int mid = start +(end - start) / 2;
            if(n==0){
                return 0;
            }
            if(n==1){
                return 1;
            }
            if(mid* mid ==n){
                return (int)mid;
            }
            else if(mid * mid < n){
                ans = mid;
                start = mid + 1;
            }
            else{
                end = mid -1;
            }
        }
        return (int) ans;
    }
}