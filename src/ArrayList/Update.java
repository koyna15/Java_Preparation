package ArrayList;

import java.util.ArrayList;

public class Update {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Avacado");
        list.add("Kiwi");
        list.add("Dragon Fruit");
        list.set(1,"Mango");
        list.set(2,"Blueberries");
        System.out.println(list);

    }
}
