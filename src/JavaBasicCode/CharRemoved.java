package JavaBasicCode;

public class CharRemoved {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        String str1 = "chiKy,,,";
        System.out.println(cleanString(str));
    }

    static String cleanString(String str) {
        return str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }
}
