package JavaBasicCode;
import java.util.*;
public class Area {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Choice: ");
        int choice = s.nextInt();
        switch(choice){
            case 1:
                System.out.println("Area of Circle.");
                System.out.println("Enter Radius for circle: ");
                double radius = s.nextDouble();
                double area1 = 3.14 * radius * radius;
                System.out.println("Area of circle: " + area1);
                break;
            case 2:
                System.out.println("Area of Rectangle.");
                System.out.println("Enter Length: ");
                double length = s.nextDouble();
                System.out.println("Enter Breadth: ");
                double breadth = s.nextDouble();
                double area2 = length * breadth;
                System.out.println("Area of Rectangle: " + area2);
                break;
            case 3:
                System.out.println("Area of Triangle.");
                System.out.println("Enter Base: ");
                double base = s.nextDouble();
                System.out.println("Enter Height: ");
                double height = s.nextDouble();
                double area3 = (0.5) * base * height;
                System.out.println("Area of Triangle: " + area3);
                break;
            case 4:
                System.out.println("Area of Equilateral Triangle.");
                System.out.println("Enter Side: ");
                double side = s.nextDouble();
                double area4 = (Math.sqrt(3)/4) * side * side;
                System.out.println("Area of Equilateral Triangle: " + area4);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
