//To calculate Fibonacci Series up to n numbers.

package JavaBasicCode;
import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int first = 0, second = 1,next;
        for(int i=0;i<num;i++){
            System.out.print(+first +" ");
            next = first + second;
            first = second;
            second = next;
        }
    }
}
