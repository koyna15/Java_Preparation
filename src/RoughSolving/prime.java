package RoughSolving;

public class prime {
    public static void main(String[] args) {
        boolean ans = isPrime(36);
        System.out.println(ans);
    }
    static boolean isPrime(int n) {
        if (n <= 1) return false;      // 0, 1, negatives not prime
        if (n == 2) return true;       // 2 is prime
        if (n % 2 == 0) return false;  // even numbers >2 are not prime

        int limit = (int) Math.sqrt(n);
        for (int i = 3; i <= limit; i += 2) { // test only odd divisors
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
