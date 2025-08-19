package CodeChef;

import java.util.Scanner;

public class SumMaxSecondMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {

            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            int max = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;
            for(int element : a){
                if(element > max){
                    secondLargest = max;
                    max = element;
                }
                else if(element > secondLargest && element < max){
                    secondLargest = element;
                }
            }
            System.out.println(max + secondLargest);

        }
    }
}
