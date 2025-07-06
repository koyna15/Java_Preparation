package JavaBasicCode;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num=121;
        int rev=0,original=num;
        while(num>0){
            rev = rev*10 + num%10;
            num/=10;
        }

        if(original==rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not");
        }
    }
}
