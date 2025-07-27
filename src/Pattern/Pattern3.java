package Pattern;

public class Pattern3 {
    public static void main(String[] args) {
        pattern(5);
    }
//    static void pattern(int n){
//        for (int i = n; i >=1 ; i--) {
//            for (int j = i; j >= 1; j--) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
    //          OR

    static void pattern(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
