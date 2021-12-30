import java.util.*;
public class NextPermutationArr {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 5, 4};
        List<Integer> ls = nextPermutation(arr.length, arr);
        System.out.println(Arrays.toString(ls.toArray()));
    }

        static List<Integer> nextPermutation(int N, int arr[]){
            // code here
            List<Integer> ls = new ArrayList<>();
            int count = 0;
            while (count < N-1) {
                if (arr[count] > arr[count+1]) {
                    count++;
                } else {
                    break;
                }
            }
            if (count == N-1) {
                reverse(arr, 0, N-1);

                for (int k = 0; k < N; k++) {
                    ls.add(arr[k]);
                }
                return ls;
            }
            int rightidx = 0, leftidx = 0;
            for (int i = N-2; i >= 0; i--) {
                if (arr[i] < arr[i+1]) {
                    leftidx = i;
                    break;
                }
            }

            for (int j = N-1; j >= 0; j--) {
                if (arr[leftidx] < arr[j]) {
                    rightidx = j;
                    break;
                }
            }

            swap(arr, leftidx, rightidx);
            reverse(arr, leftidx + 1, N-1);

            for (int l = 0; l < N; l++) {
                ls.add(arr[l]);
            }
            return ls;
        }

        static void swap(int arr[], int leftidx, int rightidx) {
            int temp = arr[rightidx];
            arr[rightidx] = arr[leftidx];
            arr[leftidx] = temp;
        }

        static void reverse(int arr[], int i, int j) {
            while (i <= j)
                swap(arr, i++, j--);
        }
}
