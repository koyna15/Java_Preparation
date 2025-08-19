package RoughSolving;

public class EvenNumDigits {
    public static void main(String[] args) {
        int[] arr = {12,340,6789,3,5,45678};
        //int ans = findEvenDig(arr);
        System.out.println(findEvenDig(arr));
        System.out.println(digits(78906));
    }
    static int findEvenDig(int[] arr){
        int count = 0;
        for(int nums : arr){
            if(evenNum(nums)){
                count++;
            }
        }
        return count;
    }
    static boolean evenNum(int num){
        int numberOfDig = digits(num);
        return numberOfDig % 2==0;
//        if(num % 2 == 0){
//            return true;
//        }
//        return false;
    }
    static int digits(int num){
        if(num<0){
            return num*=-1;
        }
        return (int)(Math.log10(num)) +1;

//        if(num<0){
//            return num*=-1;
//        }
//        if(num == 0){
//            return 1;
//        }
//        int count = 0;
//        while(num>0){
//            count++;
//            num/=10;
//        }
//        return count;
    }

}
