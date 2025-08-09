package Recursion;

public class Nto1Reverse {
    public static void main(String[] args) {
        funRev(5);
    }
    static void funRev(int n){
        if(n==0) return;
        funRev(n-1);
        System.out.println(n);
    }
}
