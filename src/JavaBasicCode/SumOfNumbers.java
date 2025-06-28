package JavaBasicCode;
import java.util.*;
public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = s.nextInt();
        int sum = (num *(num + 1)) / 2;
        System.out.println("Sum of N numbers: " +sum);

    }
}
