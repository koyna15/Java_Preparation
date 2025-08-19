package RoughSolving;

public class charRem {
    public static void main(String[] args) {
        String str = "A man,a plan, a canal, :and beautiful Chicky";
        System.out.println(cleanString(str));
    }
//    static String cleanString(String str){
//        return str.replaceAll("[^a-zA-Z0-9]","");
//    }

    static String cleanString(String str){
        return str.replaceAll("[^a-zA-Z0-9]","").toUpperCase();
    }
}
