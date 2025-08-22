package JavaBasicCode;
import java.util.*;
public class CountTheOccurrence {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int num = in.nextInt();
        int num = 56577777;
        int count = 0;
        int rem;

        while(num>0){
            rem=num%10;
            if(rem==7){
                count++;
            }
            num/=10;
        }
        System.out.println("Count of number is: " +count);
    }
}
