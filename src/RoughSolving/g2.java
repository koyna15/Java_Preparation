package RoughSolving;

public class g2 {
    public static void main(String[] args) {
        int n =12;
        int ans = evenlyDivides(n);
        System.out.println(ans);
    }
    static int evenlyDivides(int n) {
        // code here
        int count = 0;
        for (int i = 1; i < n; i++) {
            if(n%i==0){
                count++;
            }
        }
        return count;
    }
}
