package HackerRank;

import java.util.Scanner;

public class CorrespondingSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            int result = a;
            for (int j = 0; j < n; j++) {
                result += (int)Math.pow(2, j) * b;
                System.out.print(result + " ");
            }
            System.out.println();

        }
        sc.close();
    }
}
/* take input: testcase - 1
                          0 2 10

 */