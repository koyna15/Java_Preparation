package Array;

class Review {
    void pushZerosToEnd(int[] arr) {
       int write = 0;
        for (int read = 0; read < arr.length; read++) {
            if (arr[read] != 0) {
                
                if (read != write) {
                    int temp = arr[write];
                    arr[write] = arr[read];
                    arr[read] = temp;
                }
                write++;
            }
        }
    }
}