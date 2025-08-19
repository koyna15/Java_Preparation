package RoughSolving;

public class sl {
    public static void main(String[] args) {
        char[] arr = {'c','f','j'};
        char target = 'g';
        char ans= removeD(arr,target);
        System.out.println(ans);
    }
    static char removeD(char[] arr, char target){
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            int mid = start + (end -start)/2;
            if(target>arr[mid]){
                start = mid +1;
            }
            else{
                end = mid -1;
            }
        }
        return arr[start % arr.length];
    }
}
