package Recursion;

public class SkipWord {
    public static void main(String[] args) {
        System.out.println(skipWord("bcaappledh"));
    }
    static String skipWord(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("apple")){
            return skipWord(up.substring(5));
        }
        else{
            return up.charAt(0) + skipWord(up.substring(1));
        }
    }
}
