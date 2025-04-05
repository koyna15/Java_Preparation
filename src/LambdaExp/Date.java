package LambdaExp;
import java.time.LocalDate;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class Date {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        LocalDate date = LocalDate.parse(input);
        System.out.println(date);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formatted = date.format(formatter);
        System.out.println(formatted);

    }
}
