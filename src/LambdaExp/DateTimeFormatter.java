package LambdaExp;
//import java.time.LocalDate;
//import java.util.*;
//import java.time.format.DateTimeFormatter;
//
//public class UtilityIntro {
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        String input = s.nextLine();
//        LocalDate date = LocalDate.parse(input);
//        System.out.println(date);
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//        String formattedDate = date.format(formatter);
//        System.out.println(formattedDate);
//
////        LocalDate date1 = LocalDate.now();
////        System.out.println(date1);
////        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM-dd-yyyy");
////        String formattedDate1 = date1.format(formatter1);
////        System.out.println(formattedDate1);
//
//    }
//}
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.util.Scanner;
//
//public class DateTimeFormatter {
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter a date (yyyy-MM-dd): ");
//        String input = s.nextLine();
//
//        // Parses the date in ISO format (yyyy-MM-dd)
//        LocalDate date = LocalDate.parse(input);
//        System.out.println("Parsed date: " + date);
//
//        // Formatter with correct 4-digit year
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//        String formattedDate = date.format(formatter);
//        System.out.println("Formatted date: " + formattedDate);
//    }
//}
//
//
