package ArrayList;

import java.io.*;
import java.util.*;

public class BubbleSwaps {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        String[] parts = br.readLine().trim().split("\\s+");
        List<Integer> a = new java.util.ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(Integer.parseInt(parts[i]));
        }

        int totalSwaps = 0;
        for (int i = 0; i < n; i++) {
            int numberOfSwaps = 0;
            for (int j = 0; j < n - 1 - i; j++) {
                if (a.get(j) > a.get(j + 1)) {
                    int tmp = a.get(j);
                    a.set(j, a.get(j + 1));
                    a.set(j + 1, tmp);
                    numberOfSwaps++;
                }
            }
            totalSwaps += numberOfSwaps;
            if (numberOfSwaps == 0) break;
        }

        System.out.println("Array is sorted in " + totalSwaps + " swaps.");
        System.out.println("First Element: " + a.get(0));
        System.out.println("Last Element: " + a.get(n - 1));
        br.close();
    }
}
