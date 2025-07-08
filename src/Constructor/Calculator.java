package Constructor;

import java.util.Scanner;

public class Calculator {
    int n1,n2;
    Calculator(int n1,int n2){
        this.n1=n1;
        this.n2=n2;
    }
    void sum(int n1, int n2){
        int add = n1+n2;
        System.out.println("Addition: " +add);
    }
    void sub(int n1, int n2){
        int diff = n1-n2;
        System.out.println("Difference: " +Math.abs(diff));
    }
    void multiply(int n1, int n2){
        int product = n1*n2;
        System.out.println("Product: " +product);
    }
    void div(int n1, int n2){
        int divide = n1 / n2;
        System.out.println("Division: " +divide);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = in.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = in.nextInt();
        Calculator cal = new Calculator(num1,num2);
        cal.sum(num1,num2);
        cal.sub(num1,num2);
        cal.multiply(num1,num2);
        cal.div(num1,num2);
    }
}