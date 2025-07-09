package Functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,5,646,677);
        multiple(2,4,"Chicky","Chicks","Mamta");
    }
    static void multiple(int a,int b, String ...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
//length is not constant here.it varies towards various inputs.
//variable length args at the end only.