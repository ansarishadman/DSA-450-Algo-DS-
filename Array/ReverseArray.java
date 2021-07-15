public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1, 4, 6, 7, 8, 6};
        int start = 0;
        int end = arr.length - 1;
        reverseArray(arr, arr.length, start, end);
        printReversedArray(arr, arr.length);
    }

    static void reverseArray(int arr[], int n, int start, int end) {
        int temp;
        if (start >= end) {
            return;
        }
        if (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        reverseArray(arr, n, start + 1, end - 1);
    }

    static void printReversedArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
