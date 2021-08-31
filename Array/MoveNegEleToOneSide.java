public class MoveNegEleToOneSide {
    public static void main(String[] args) {
        int arr[] = { -12, 11, -13, -5, 6, -7, 5, -3, 11 };
        int n = arr.length;

        rearrangeNegative(arr, n);
    }

    static void rearrangeNegative(int arr[], int n) {
        int left = 0, right = n-1;
        int temp;
        while (left <= right) {
            if (arr[left] < 0 && arr[right] < 0) {
                left++;
            } else if (arr[left] > 0 && arr[right] < 0) {
                temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                left++;
                right--;
            } else if (arr[left] > 0 && arr[right] > 0) {
                right--;
            } else {
                left++;
                right--;
            }
        }
        printArray(arr, n);
    }

    static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
