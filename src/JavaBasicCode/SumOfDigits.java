package JavaBasicCode;
import java.util.*;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = s.nextInt();
        int sum=0;
        while(num!=0){
            sum = sum + num % 10;
            num/=10;
        }
        System.out.println("Sum of Digits: " +sum);
    }
}
