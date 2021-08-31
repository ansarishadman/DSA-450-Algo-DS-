public class Sort012 {
    public static void main(String[] args) {
        int arr[] = {1, 0, 2, 0, 2, 1, 1, 2, 0, 0, 1, 2};
        int n = arr.length;
        sort(arr, n);
    }

    static void sort(int arr[], int n) {
        int low = 0, mid = 0, high = n-1;
        int temp;
        while (mid <= high) {
            if (arr[mid] == 0) {
                temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
