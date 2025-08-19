package GfG;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr ={2, 2, 2, 2, 2};
        ArrayList<Integer> res = remove(arr);
        System.out.println(res);
    }
    static ArrayList<Integer> remove(int[] arr){
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i-1]){
                temp.add(arr[i]);
            }
        }
        return temp;
    }
}
