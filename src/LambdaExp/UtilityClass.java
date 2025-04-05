package LambdaExp;
import java.time.LocalDate;
public class UtilityClass {
    public static void main(String[] args) {
        LocalDate t = LocalDate.of(2003, 10, 9);
//        System.out.println(t.getYear());
//        System.out.println(t.getMonth());
//        System.out.println( t.getDayOfMonth());
//        System.out.println(t.minusYears(1));
//        System.out.println(t.getDayOfYear());
//        System.out.println(t.getMonth());

        LocalDate c = LocalDate.of(2003,12,15);
        System.out.println(c.getYear());
        System.out.println(c.getMonth());


    }

}
