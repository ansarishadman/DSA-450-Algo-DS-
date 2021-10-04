public class CountInversions {
    public static void main(String[] args) {
        long[] arr = {2, 4, 1, 3, 5};
        long N = arr.length;

        long ans = inversionCount(arr, N);
        System.out.println("The inversion count is " + ans);
    }

    static long inversionCount(long arr[], long N) {
        // Your Code Here
        long[] temp = new long[(int) N];
        long ans = _mergeSort(arr, temp, 0, (int) N - 1);
        return ans;
    }

    static long _mergeSort(long arr[], long temp[], int left, int right) {
        int mid;
        long inv_count = 0;

        if (right > left) {

            mid = (left + right) / 2;

            inv_count += _mergeSort(arr, temp, left, mid);
            inv_count += _mergeSort(arr, temp, mid + 1, right);

            inv_count += merge(arr, temp, left, mid + 1, right);
        }
        return inv_count;
    }

    static long merge(long arr[], long temp[], int left, int mid, long right) {
        int i, j, k;
        long inv_count = 0;
        i = left;
        j = mid;
        k = left;

        while ((i <= mid - 1) && (j <= right)) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];

                inv_count = inv_count + (mid - i);
            }
        }

        while (i <= mid - 1) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (i = left; i <= right; i++) {
            arr[i] = temp[i];
        }

        return inv_count;
    }

}
