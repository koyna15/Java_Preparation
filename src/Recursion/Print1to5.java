package Recursion;

public class Print1to5 {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        if(n==5){
            System.out.print(5);
            return;
        }
        System.out.print(n +" ");
        print(n+1);
    }
}
