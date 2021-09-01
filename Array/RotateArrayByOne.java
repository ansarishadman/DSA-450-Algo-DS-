public class RotateArrayByOne {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;

        rotate(arr, n);
    }

    static void rotate(int arr[], int n) {
        int temp = arr[n-1];

        for (int i = n-1; i > 0; i--)
            arr[i] = arr[i-1];
        arr[0] = temp;

        printArray(arr, n);
    }

    static void printArray(int arr[], int n) {
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}

