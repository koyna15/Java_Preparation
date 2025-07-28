package ArrayList;

import java.util.ArrayList;

public class Contains {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Avacado");
        list.add("Kiwi");
        list.add("Dragon Fruit");
        System.out.println(list.contains("Kiwi"));
        System.out.println(list.contains("Mango"));

    }
}
