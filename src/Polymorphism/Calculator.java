package Polymorphism;
//Method Overloading
class Calculator{
    static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b, int c){
        return a+b+c;
    }
    static double sum(double x, double y){
        return x+y;
    }

    public static void main(String[] args) {
//        Calculator calc = new Calculator();
        int ans = sum(6,7);

        System.out.println(ans);
        System.out.println(Calculator.sum(9,8,7));
        System.out.println(Calculator.sum(4.5,6.7));
    }
}