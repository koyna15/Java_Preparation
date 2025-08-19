package GfG;

class BS {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2};
        int k = 1;

        int first = firstOccurrence(arr, k);
        int last = lastOccurrence(arr, k);
        System.out.println("First occurrence of " + k + " is at index: " + first);
        System.out.println("Last occurrence of " + k + " is at index: " + last);
    }
    public static int firstOccurrence(int[] arr, int k) {
        int start = 0;
        int end = arr.length - 1;
        int result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == k) {
                result = mid;
                end = mid - 1;
            } else if (k > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }

    public static int lastOccurrence(int[] arr, int k) {
        int start = 0;
        int end = arr.length - 1;
        int result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == k) {
                result = mid;
                start = mid + 1; 
            } else if (k > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }
}
