//Take 2 numbers as inputs and find their HCF and LCM

package JavaBasicCode;
import java.util.*;
public class HCFandLCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int num1 = input.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = input.nextInt();
        int hcf=0;
        for(int i=1;i<=num2;i++){
            if(num1 % i == 0 && num2 % i == 0){
                hcf = i;
            }
        }
        System.out.println("HCF of " +num1 +" and " +num2 +" is " +hcf);
        int lcm = (num1 * num2)/hcf;
        System.out.println("LCM of " +num1 +" and " +num2 +" is " +lcm);
    }
}
