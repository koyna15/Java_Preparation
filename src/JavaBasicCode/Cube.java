package JavaBasicCode;

public class Cube {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            int square=0;
            for (int j = 0; j < i; j++) {
                square+=i;
            }
            int cube=0;
            for (int j = 0; j < i; j++) {
                cube+=square;
            }
            System.out.println(cube);
        }
    }
}


