package ArrayList;

import java.util.ArrayList;

public class RetrieveElements {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Avacado");
        list.add("Kiwi");
        list.add("Dragon Fruit");
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.get(1));
    }
}
