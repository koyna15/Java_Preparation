package JavaBasicCode;

public class EvenOddSum {
    public static void main(String[] args) {
        int evensum=0;
        int oddsum=0;
        for (int i = 0; i <= 10; i+=2) {
            evensum+=i;
        }
        System.out.println(evensum);
        for (int i = 1; i <=10; i+=2) {
            oddsum+=i;
        }
        System.out.println(oddsum);
    }
}
