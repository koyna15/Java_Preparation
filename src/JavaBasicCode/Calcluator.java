//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

package JavaBasicCode;

import java.util.*;
public class Calcluator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int num1 = input.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = input.nextInt();
        System.out.println("Enter Operator (+,-,*,/) : ");
        char operator = input.next().charAt(0);
        int result;
        if(operator == '+'){
            result = num1 + num2;
            System.out.println("Result is: " + result);
        }
        else if (operator == '-') {
            result = num1 - num2;
            System.out.println("Result is: " + result);
        }
        else if(operator == '/'){
            result = num1 / num2;
            System.out.println("Result is: " + result);
        }
        else{
                result = num1 * num2;
            System.out.println("Result is: " + result);
            }
    }
}
