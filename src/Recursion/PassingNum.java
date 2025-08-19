package Recursion;

public class PassingNum {
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n){
        if(n == 0) {
            return;
        }
        System.out.println(n);
        //fun(n--);
        // it will pass first and then subtract that's why giving error.
       //In recursion, each call gets its own copy of the variable. So n-- inside the argument doesn’t affect the already passed value for that call. You end up passing the same n over and over until stack overflow happens.
        fun(--n);
    }
}
