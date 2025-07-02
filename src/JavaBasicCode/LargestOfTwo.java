//Take 2 numbers as input and print the largest number

package JavaBasicCode;
import java.util.*;
public class LargestOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int num1 = input.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = input.nextInt();
        if(num1 > num2){
            System.out.println("Number " +num1 + " is largest among two.");
        }
        else{
            System.out.println("Number " +num2 +" is largest among two.");
        }
    }
}
