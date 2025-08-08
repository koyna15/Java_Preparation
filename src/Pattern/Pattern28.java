package Pattern;

public class Pattern28 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for (int row = 1; row < 2*n; row++) {
            int totColRow= row>n ? 2*n - row : row;
            int noOfSpaces = Math.abs(n - row); // n - c is also right.
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totColRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
