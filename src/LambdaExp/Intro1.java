package LambdaExp;

import java.sql.SQLOutput;

interface add1{
    int sum(int a, int b);
}

interface division{
    int div(int m, int n);
}
public class Intro1 {
    public static void main(String[] args) {
        add1 a1;
        a1 = (int a, int b) -> a+b;
        System.out.println(a1.sum(4,7));

        division d;
        d = (int m, int n) -> m/n;
        System.out.println(d.div(6,3));
    }
}
