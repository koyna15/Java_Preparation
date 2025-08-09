package Maths;

public class Fibo {
    public static void main(String[] args) {
//        for (int i = 1; i < 11; i++) {
//            System.out.println(fiboFormula(i));
//        }
        System.out.println(fiboFormula(50));
    }
    static long fiboFormula(int n){
        return (int)(Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));
    }
}
