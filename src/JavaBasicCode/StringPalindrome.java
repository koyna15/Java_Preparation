package JavaBasicCode;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        char[] ch = str.toCharArray();
        int start=0,end=str.length()-1;
        while(start<=end){
            char temp = ch[start];
            ch[start]=ch[end];
            ch[end]=temp;
            start++;
            end--;
        }
        String reverse = new String(ch);
        if(str.equals(reverse)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not");
        }
    }
}
