package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class RemoveEvenAL {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1,2,3,4,5));
        list.removeIf(n -> n%2==0);
        System.out.println(list);
    }
}
