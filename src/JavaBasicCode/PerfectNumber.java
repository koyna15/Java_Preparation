package JavaBasicCode;
import java.util.*;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = s.nextInt();
        int sum = 0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum==num){
            System.out.println(num +" is a Perfect number.");
        }
        else{
            System.out.println(num +" is not a Perfect number");
        }

    }
}
