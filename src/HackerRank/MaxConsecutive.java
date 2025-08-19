package HackerRank;

import java.util.Scanner;

public class MaxConsecutive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        String binaryString = Integer.toBinaryString(n);
        String[] onesGroups = binaryString.split("0");

        int maxConsecutive = 0;
        for (String group : onesGroups) {
            if (group.length() > maxConsecutive) {
                maxConsecutive = group.length();
            }
        }

        System.out.println(maxConsecutive);
    }
}
