package LambdaExp;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class UtilityClass2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your date of birth (YYYY-MM-DD): ");
        String dobInput = scanner.nextLine();
        LocalDate birthDate = LocalDate.parse(dobInput);
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(birthDate, currentDate);
        System.out.println("Your age is: " + age.getYears() + " years");
        System.out.println(birthDate);
        scanner.close();
    }

}
