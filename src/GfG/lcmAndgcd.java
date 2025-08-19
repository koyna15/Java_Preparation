package GfG;

import java.util.Arrays;

class lcmAndgcd {
    public static void main(String[] args) {
        int[] ans = lcmAndGcd(5, 10);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] lcmAndGcd(int a, int b) {
        int k=2,hcf=0;
        int[] arr = new int[k];
        for (int i = 1; i <= b; i++) {
            if(a%i==0 && b%i==0){
                hcf=i;
            }
        }
        int lcm =(a*b)/hcf;
        arr[0] = lcm;
        arr[1] = hcf;
        return arr;
    }
}