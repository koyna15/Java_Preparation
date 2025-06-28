package LargestAmong3Numbers;
import java.util.*;
public class SecondWay {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = in.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = in.nextInt();
        System.out.println("Enter 3rd number: ");
        int c = in.nextInt();

        int max=0;
        if(a>b){
            max=a;
        } else {
            max=b;
        }
        if(c>max){
            max=c;
        }
        System.out.println("Maximum number is: " +max);
    }
}
