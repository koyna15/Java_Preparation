package Functions;

import java.util.Arrays;

public class FunctionOverloading {
    public static void main(String[] args) {
        fun(23);
        //fun("Chicky");
        int ans =sum(3,4,6);
        System.out.println(ans);
        demo(4,5,6,7,8);
        demo("Chicky","Suresh");
        //demo();//here in overloading varags won't run coz its confusing which one to run.
    }
    static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a,int b ,int c){
        return a+b+c;
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
//number and type of arguments should be different
