package JavaBasicCode;

public class CheckPrime {
    public static void main(String[] args) {
        boolean ans = isPrime(36);
        System.out.println(ans);
    }
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        int limit = (int) Math.sqrt(n);
        for (int i = 3; i <= limit; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
