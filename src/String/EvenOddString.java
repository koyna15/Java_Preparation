package String;

import java.util.Scanner;

public class EvenOddString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while (t-- > 0) {
            String str = in.nextLine();
            String even = "";
            String odd = "";
            char[] ch = str.toCharArray();
            // Print even indexed characters together
            for (int i = 0; i < ch.length; i++) {
                if (i % 2 == 0) {
                    even+= str.charAt(i);
                }
                else{
                    odd+= str.charAt(i);
                }
            }
            System.out.println(even +" "+odd);
        }
    }
}


