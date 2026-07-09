package CSES;

public class WeirdAlgo {
    public static void main(String[] args) {

        fun(3);
    }
    static void fun(int n){

        System.out.print(n);

        if(n == 1) return;

        System.out.print("->");
        if(n%2 == 1){
            fun((n*3) + 1);
        }
        else{
            fun(n/2);
        }
    }
}
