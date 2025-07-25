package Constructor;

class Calc{
    int num1;
    char operator;
    int num2;
    Calc(int num3,char ch,int num4){

        this.num1=num3;
        this.operator = ch;
        this.num2=num4;

        if(ch == '+'){
            System.out.println(num1 + num2);
        }
        else if(ch == '-'){
            System.out.println(Math.abs(num1 - num2));
        }
        else if(ch == '*'){
            System.out.println(num1 * num2);
        }
        else if(ch == '/'){
            System.out.println(num1 / num2);
        }
        else{
            System.out.println("Invalid operator.");
        }
    }

}
public class Calculator1 {
    public static void main(String[] args) {
        Calc ob = new Calc(3,'-',40);
//        System.out.println(a +" " +b);
//        int a = 10;
//        int b = 20;

    }
}
