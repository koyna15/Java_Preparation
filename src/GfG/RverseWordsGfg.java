package GfG;

public class RverseWordsGfg {
    public static void main(String[] args) {
        String s = "..hello.world.yash";
        String ans = reverseWords(s);
        System.out.println(ans);
    }
    public static String reverseWords(String s) {
        String[] parts = s.split("\\.");
        StringBuilder result = new StringBuilder();

        for(int i = parts.length - 1; i >= 0; i--) {
            //parts=["","","hello","world","yash"]
            //i=;
            //parts[0]=""
            if(parts[i].length() == 0) continue;//skip

            if(result.length() > 0) {
                result.append(".");
            }
            result.append(parts[i]);//res= yash.world.hello
        }

        return result.toString();
    }
}
