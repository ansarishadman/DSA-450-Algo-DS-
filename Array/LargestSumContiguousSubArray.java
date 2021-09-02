public class LargestSumContiguousSubArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, -2, 5 };
        int n = arr.length;

        System.out.println(maxSubArraySum(arr, n));
    }

    static long maxSubArraySum(int arr[], int n) {
        long curr = 0;
        long max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            curr = Math.max(arr[i], arr[i] + curr);
            if (curr > max) {
                max = curr;
            }
        }
        return max;
    }
}

