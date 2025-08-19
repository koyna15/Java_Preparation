package RoughSolving;
import java.util.*;
public class eof {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int chars = 1;
//        while(in.hasNext()){
//            String str = in.nextLine();
//            System.out.println(chars +" " +str);
//            chars++;
//        }

        Scanner s = new Scanner(System.in);
        int lengchar = 1;
        while(s.hasNext()){
            int a  = s.nextInt();
            int b= s.nextInt();
            int sum = a + b;
            System.out.println(sum);
            lengchar++;
        }
    }
}
