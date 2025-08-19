package HackerRank;

import java.util.*;

public class ArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        java.util.ArrayList<java.util.ArrayList<Integer>> list = new java.util.ArrayList<>();

        for(int i=0;i<n;i++){
            int d = in.nextInt();
            java.util.ArrayList<Integer> row = new java.util.ArrayList<>();
            for(int j=0;j<d;j++){
                row.add(in.nextInt());
            }
            list.add(row);
        }
        int q=in.nextInt();
        for(int i=0;i<q;i++){
            int x = in.nextInt();
            int y = in.nextInt();
            x--;
            y--;
            if (x >= 0 && x < list.size()) {
                java.util.ArrayList<Integer> row = list.get(x);
                if (y >= 0 && y < row.size()) {
                    System.out.println(row.get(y));
                } else {
                    System.out.println("ERROR!");
                }
            } else {
                System.out.println("ERROR!");
            }
        }
    }
}
