import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int arr[] = {1, 3, 2};
        nextPermutation(arr);
        System.out.print(Arrays.toString(arr));
    }

    static void nextPermutation(int arr[]) {
        int i = arr.length - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) i--;

        int j = arr.length - 1;
        if (i >= 0) {
            if (arr[i] >= arr[j]) j--;
            swap(arr, i ,j);
        }
        reverse(arr, i+1, j);
    }

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int arr[], int i, int j) {
        while(i < j) swap(arr, i++, j--);
    }
}
