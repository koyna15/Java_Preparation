//To find Armstrong Number between two given number.

package JavaBasicCode;
import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to check of it is Armstrong: ");
        int num = input.nextInt();
        int sum=0, original= num;
        while(num!=0){
            int digit = num % 10;
            sum += digit * digit * digit;
            num/=10;
        }
        if(sum == original){
            System.out.println("Armstrong.");
        }
        else{
            System.out.println("Not Armstromg.");
        }
    }
}
