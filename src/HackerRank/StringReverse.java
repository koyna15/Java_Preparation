package HackerRank;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        if(isPalindrome(A)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    static boolean isPalindrome(String str){
        int start=0,end=str.length()-1;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
