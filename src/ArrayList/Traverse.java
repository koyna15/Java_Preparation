package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Traverse {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("A","B","C"));
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) +" ");
        }
        System.out.println();
        for(String str : list){
            System.out.print(str +" ");
        }
    }
}
