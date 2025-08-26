package Recursion;

import java.util.ArrayList;

public class SubSeqASCII {
    public static void main(String[] args) {
        subseqAscii("","abc");
        System.out.println(subseqAsciiList("","abc"));
    }
    static void subseqAscii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseqAscii(p + ch , up.substring(1));
        subseqAscii(p, up.substring(1));
        subseqAscii(p +(ch+0), up.substring(1));
    }
    static ArrayList<String> subseqAsciiList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseqAsciiList(p + ch , up.substring(1));
        ArrayList<String> right = subseqAsciiList(p, up.substring(1));
        ArrayList<String> ascii = subseqAsciiList(p + (ch+0) , up.substring(1));
        left.addAll(right);
        left.addAll(ascii);
        return left;
    }
}
