package Functions;

public class Palindrome {
    public static void main(String[] args) {
        int num=222;
        palindrome(num);
    }

    private static void palindrome(int num) {
        int original = num;
        int rev = 0;
        while (num > 0) {

            rev = rev * 10 + num % 10;
            num /= 10;
        }
        if (original == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not");
        }
    }
}
