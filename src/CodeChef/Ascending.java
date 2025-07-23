package CodeChef;

import java.util.Scanner;

public class Ascending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] d = new int[n];

            for (int i = 0; i < n; i++) {
                d[i] = scanner.nextInt();
            }
            boolean isAsc = true;
            for(int i=0;i<n-1;i++){
                if(d[i] > d[i+1]){
                    isAsc = false;
                    break;
                }
            }
            if (isAsc) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
