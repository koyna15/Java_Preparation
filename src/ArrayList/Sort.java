package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(2,5,3,1,4));
        Collections.sort(list);
        System.out.println(list);
        System.out.println(list.size());
    }
}
