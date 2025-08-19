package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(98);
//        list.add(76);
//        list.add(54);
//        list.add(63);
//
//        System.out.println(list);
//
//        System.out.println(list.contains(76));
//        list.set(0,88);
//        list.remove(2);
//        System.out.println(list);

        for(int i = 0;i<5;i++){
            list.add(in.nextInt());
        }
        for(int i = 0;i<5;i++){
            System.out.print(list.get(i) +" ");//pass index here, list.get(index)
        }

    }
}
