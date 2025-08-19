package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CompareTriplets {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int alice = 0;
        int bob = 0;

        for (int i = 0; i < 3; i++) {
            if (a.get(i) > b.get(i)) {
                alice++;
            } else if (a.get(i) < b.get(i)) {
                bob++;
            }
        }

        return Arrays.asList(alice, bob);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Alice
        List<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < 3; i++) {
            a.add(scanner.nextInt());
        }

        // Input for Bob
        List<Integer> b = new ArrayList<Integer>();
        for (int i = 0; i < 3; i++) {
            b.add(scanner.nextInt());
        }

        // Compare and get results
        List<Integer> result = compareTriplets(a, b);

        // Output result
        System.out.println(result.get(0) + " " + result.get(1));
    }
}
