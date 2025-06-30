package Functions;
import java.util.*;
public class Eligibility {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        eligible(age);
    }

     static void eligible(int age) {
        if(age>=18){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not Eligible");
        }
    }
}
