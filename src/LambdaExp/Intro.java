package LambdaExp;

interface message{
    String name();
}

interface number{
    int reg(int n);
}

interface check{
    boolean divByThree(int n);
}

interface add{
    int sum(int a, int b);
}

interface multiplication{
    int multiply(int a, int b, int c);
}

interface Car{
    String brand();
}

interface Car1{
    String Brand(String name);
}

interface Factorial{
    int fact(int n);
}

interface sumOfDigit{
    int sum(int n);
}
public class Intro {
    public static void main(String[] args) {
        message ob;
        ob = () -> "Chicky";
        System.out.println(ob.name());

        number n1;
        n1 = (n) -> n;
        System.out.println(n1.reg(12));

        check t;
        t = (n) -> n%3==0;
        System.out.println(t.divByThree(27));

        add d;
        d = (int a, int b) -> a+b;
        System.out.println(d.sum(3,6));

        multiplication m;
        m = (int a, int b, int c) -> (a*b*c);
        System.out.println(m.multiply(1,2,3));

        Car c;
        c = () -> "BMW";
        System.out.println(c.brand());

        Car1 c1;
        c1 = (name) -> name;
        System.out.println(c1.Brand("city"));

//        Factorial f = (int n) -> {
//            int res = 1;
//            for(int i=1;i<=n;i++){
//                res*=i;
//            }
//            return res;
//        };
//        int num = 5;
//        System.out.println(f.fact(num));

        sumOfDigit sg = (int n) -> {
            int add = 0;
            while (n > 0) {
                add += n % 10;
                n = n / 10;
            }
            return add;
        };

        int num = 53;
        System.out.println(sg.sum(num));
    }
}
