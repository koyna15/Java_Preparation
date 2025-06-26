//Input currency in rupees and output in USD

package JavaBasicCode;
import java.util.*;
public class Currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter currency in Rupees: ");
        double rupees = input.nextDouble();
        double exchangeRate = 0.01153;
        double dollars = rupees * exchangeRate;
        System.out.println("Currency in Dollars: %.2f\n" +dollars);
    }
}
