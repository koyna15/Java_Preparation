package Constructor;

import java.util.*;
public class Perimeter {
    double len, bre;
    Perimeter(double len, double bre){
        this.len=len;
        this.bre=bre;
    }
    void displayDetails(){
        double perimeter = 2*(len + bre);
        System.out.println("Perimeter is: " +perimeter);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length: ");
        double length = s.nextDouble();
        System.out.print("Enter breadth: ");
        double breadth = s.nextDouble();
        Perimeter ob = new Perimeter(length,breadth);
        ob.displayDetails();
    }
}