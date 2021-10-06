import java.util.*;
class RearrangeArrayAltPosNegWithO1Space {
    public static void main(String[] args) {
        int[] arr = { -5, -2, 5, 2, 4, -7, 1, 8, 0, -8 };

        Arrays.sort(arr);
        int pos  = 0, neg = 0;

        for (Integer i: arr) {
            if (i >= 0)
                pos++;
            else
                neg++;
        }
        if (neg <= pos) {
            altNegToPos(arr, neg, pos);
        } else {
            reverseArray(arr);
            altNegToPos(arr, pos, neg); // notice the change in neg and pos positions
        }
        System.out.println(Arrays.toString(arr));
    }

    static void altNegToPos(int[] arr, int neg, int pos) {
        int temp;
        if (neg % 2 == 1) {
            for (int i = 1; i < neg; i+=2) {
                temp = arr[i];
                arr[i] = arr[i + neg];
                arr[i + neg] = temp;
            }
        } else {
            for (int i = 1; i < neg; i+=2) {
                temp = arr[i];
                arr[i] = arr[i + neg -1];
                arr[i + neg - 1] = temp;
            }
        }
    }

    static void reverseArray(int[] arr) {
        int n = arr.length;
        int temp;
        for (int i = 0; i < n/2; i++) {
            temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }
}