package HackerRank;

import java.io.*;
import java.util.*;

class Res {

    public static long aVeryBigSum(List<Long> ar) {
        long sum = 0;
        for (int i = 0; i < ar.size(); i++) {
            sum += ar.get(i);
        }
        return sum;
    }

}

public class aVeryBigSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Read number of elements
        int arCount = Integer.parseInt(bufferedReader.readLine().trim());

        // Read elements as string array
        String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Long> ar = new java.util.ArrayList<Long>();

        for (int i = 0; i < arCount; i++) {
            long arItem = Long.parseLong(arTemp[i]);
            ar.add(arItem);
        }

        long result = Res.aVeryBigSum(ar);

        // Print to console instead of file
        System.out.println(result);

        bufferedReader.close();
    }
}
