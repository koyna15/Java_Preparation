package Maths;

public class EvenOrNot {
    public static void main(String[] args) {
        int n = 68;
        System.out.println(isOdd(n));
    }
    static boolean isOdd(int n){
        return (n&1) == 1;
    }
}
