package LargestAmong3Numbers;
import java.util.*;
public class FourthWay {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = in.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = in.nextInt();
        System.out.println("Enter 3rd number: ");
        int c = in.nextInt();

        if(a>b){
            System.out.println("Maximum number is: " +a);
        }
        if(b>c){
            System.out.println("Maximum number is: " +b);
        }
        else{
            System.out.println("Maximum number is: " +c);
        }
    }
}
