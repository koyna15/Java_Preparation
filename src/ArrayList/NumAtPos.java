package ArrayList;

import java.util.*;

public class NumAtPos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i=0;i<n;i++){
            int d = in.nextInt();
            ArrayList<Integer> row = new ArrayList<>();
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
                ArrayList<Integer> row = list.get(x);
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
/* Input:
5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5

 */
