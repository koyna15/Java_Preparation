//Write a program to print whether a number is even or odd, also take input from the user.

package JavaBasicCode;
import java.util.*;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = s.nextInt();
        if(x%2==0){
            System.out.println("Number is Even.");
        }
        else{
            System.out.println("Number is Odd.");
        }
    }
}
