package HashMapp;

import java.util.HashMap;
import java.util.Map;

public class FrequencyMap {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 1, 2};

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int x : arr) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        System.out.println("Frequency map:");
        for (Map.Entry<Integer, Integer> i : freq.entrySet()) {
            System.out.println(i.getKey() + " -> " + i.getValue());
        }
    }
}
