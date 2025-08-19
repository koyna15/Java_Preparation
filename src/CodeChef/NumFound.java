package CodeChef;

import java.util.Scanner;

public class NumFound {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int target = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        boolean found = false;
        for(int i=0;i<n;i++){
            if(arr[i] == target){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
