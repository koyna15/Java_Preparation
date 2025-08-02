package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class StartsWithLetter {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("Raju","Suresh","Shambhu","Arun"));
        for (String names: list){
            if(names.startsWith("A")){
                System.out.println(names +" ");
            }
        }
    }
}
