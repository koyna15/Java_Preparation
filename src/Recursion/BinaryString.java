package Recursion;

import java.util.*;
import java.util.ArrayList;

public class BinaryString {
    public static void main(String[] args) {

        int n = 3;
        ArrayList<String> result = binstr(n);
        System.out.println(result);

    }

    static void fun(int idx, String curr, ArrayList<String> ans, int n) {

        if (idx == n) {
            ans.add(curr);
            return;
        }

        fun(idx + 1, curr + "0", ans, n);

        fun(idx + 1, curr + "1", ans, n);
    }
    
    static ArrayList<String> binstr(int n) {
        ArrayList<String> ans = new ArrayList<>();
        fun(0, "", ans, n);
        return ans;
    }

}
