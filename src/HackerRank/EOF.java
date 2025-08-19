package HackerRank;

import java.util.Scanner;

public class EOF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 1;
        while(in.hasNext()){
            String str = in.nextLine();
            System.out.println(n +" " +str);
            n++;
        }
    }
}
/*Hello world
I am a file
Read me until end-of-file.*/
