import java.util.Arrays;

public class Merge2SortedArraysWithNoExtraSpace {
    public static void main(String[] args) {
        int arr1[] = {1, 3, 5, 7};
        int arr2[] = {0, 2, 6, 8, 9};

        int n = arr1.length;
        int m = arr2.length;

        mergeArrays(arr1, arr2, n, m);
    }

    static void mergeArrays(int arr1[], int arr2[], int n, int m) {
        int i = 0, j = 0, k = n - 1, temp;
        while (i <= k && j < m) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else {
                temp = arr1[k];
                arr1[k]= arr2[j];
                arr2[j] = temp;
                j++;
                k--;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println("Array1");
        for (int l = 0; l < n; l++) {
            System.out.print(arr1[l] + " ");
        }
        System.out.println("");
        System.out.println("Array2");
        for (int r = 0; r < m; r++) {
            System.out.print(arr2[r] + " ");
        }
    }
}
