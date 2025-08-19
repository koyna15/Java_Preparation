package String;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "chicky soni hello";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('c'));
        System.out.println(name.lastIndexOf('y'));
        System.out.println("    chicky    ".strip());
        System.out.println(Arrays.toString(name.split(" ")));

    }
}
