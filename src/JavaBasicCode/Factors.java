package JavaBasicCode;
import java.util.*;
public class Factors {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = s.nextInt();
        System.out.println("Factors of " +num +" are: ");
        for(int i=1;i<=num;i++){
            if(num % i==0){
                System.out.println(i +" ");
            }
        }
    }
}
