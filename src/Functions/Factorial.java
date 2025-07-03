package Functions;
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number for factorial: ");
        int num = in.nextInt();
        factorial(num);
    }

    static void factorial(int num) {
        int fact = 1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        System.out.println("Factorial is: " +fact);
    }
}
