//Take name as input and print a greeting message for that particular name

package JavaBasicCode;

import java.util.*;
public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name = input.nextLine();
        System.out.println("Hello " +name);
    }
}
