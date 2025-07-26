package String;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        char ch = 0;
        for (int i = 0; i < 26; i++) {
            ch = (char) ('a' + i);
            //System.out.println(ch);
            series = series + ch;
        }
        System.out.println(series);
    }
}
