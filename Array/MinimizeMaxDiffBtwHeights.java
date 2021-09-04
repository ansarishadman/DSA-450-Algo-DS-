import java.util.Arrays;

public class MinimizeMaxDiffBtwHeights {
    public static void main(String[] args) {
        int arr[] = {3, 9, 12, 16, 20};
        int n = arr.length;
        int k = 3;

        int diff = getMinDiff(arr, n, k);
        System.out.print("Difference is " + diff);
    }
    static int getMinDiff(int arr[], int n, int k) {
        Arrays.sort(arr);
        int min, max, diff;
        diff = arr[n - 1] - arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] >= k) {
                min = Math.min(arr[0] + k, arr[i] - k);
                max = Math.max(arr[n - 1] - k, arr[i - 1] + k);
                diff = Math.min(diff, max - min);
            }
        }
        return diff;
    }
}

