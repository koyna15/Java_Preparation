package GfG;

import java.util.ArrayList;
import java.util.Stack;

class StockSpan {
    public static void main(String[] args) {
        int[] arr = {100, 80, 90, 120};
        ArrayList<Integer> ans = calculateSpan(arr);
        System.out.println(ans);
    }
    public static ArrayList<Integer> calculateSpan(int[] arr) {
        
        int n = arr.length;
        ArrayList<Integer> span = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
            span.add(i + 1);
            }
            else{
                span.add(i - st.peek());
            }
            st.push(i);
        }
        return span;
    }
}