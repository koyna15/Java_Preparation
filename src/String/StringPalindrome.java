package String;

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        isPalindrome(str);
    }
    static void isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(str).reverse().toString();
        if (str.equals(reversed)) {
            System.out.println("It's a palindrome.");
        } else {
            System.out.println("It's not a palindrome.");
        }
    }
}
