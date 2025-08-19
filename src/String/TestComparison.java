package String;

public class TestComparison {
    public static void main(String[] args) {
        String a = "chikki";
        String b = "chikki";
        System.out.println(a == b);//checks in string pool
        String a1 = new String("chikki");
        String b1 = new String("chikki");
        System.out.println(a1 == b1); // outside string pool
        System.out.println(a1.equals(b1)); //checks the value // equals - method
        System.out.println(a1.charAt(0));
    }
}
