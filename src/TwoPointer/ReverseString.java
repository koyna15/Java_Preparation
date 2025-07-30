package TwoPointer;

import java.sql.SQLOutput;
import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        String str = "racecar";
        char[] ch = str.toCharArray();
        int start=0,end =str.length()-1;
        while(start<=end){
            char temp = ch[start];
            ch[start]=ch[end];
            ch[end]=temp;
            start++;
            end--;
        }
        String reversed = new String(ch);

        System.out.println(reversed);
    }
}
