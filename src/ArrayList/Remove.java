package ArrayList;

import java.util.ArrayList;

public class Remove {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Avacado");
        list.add("Kiwi");
        list.add("Dragon Fruit");
        list.remove(1);
        System.out.println(list);
        list.add("Orange");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);

    }
}
