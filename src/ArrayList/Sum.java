package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Sum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(10,20,30));
        int sum=0;
        for(int add : list){
            sum+=add;
        }
        System.out.println("Sum: " +sum);
    }
}
