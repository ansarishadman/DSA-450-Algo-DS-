public class FindDuplicateInNPlus1 {
    public static void main(String[] args) {
        int arr[] = {0, 4, 3, 2, 7, 8, 2, 3, 1 };

        findDupes(arr);
    }

    static void findDupes(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[arr[i] % n] = arr[arr[i] % n] + n;
        }

        // print duplicate elements
        System.out.println("Repeating elements:");
        for (int j = 0; j < n; j++) {
            if (arr[j] >= n*2) {
                System.out.print(j + " ");
            }
        }
    }
}
