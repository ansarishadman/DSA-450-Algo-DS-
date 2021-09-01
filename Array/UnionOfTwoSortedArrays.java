import java.util.*;
import java.util.HashSet;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 4, 5, 6, 7 };
        int n = arr1.length;
        int m = arr2.length;

        doUnion(arr1, n, arr2, m);
    }

    static void doUnion(int a[], int n, int b[], int m) {
            Set<Integer> un = new HashSet<>();
            for (int i = 0; i < n; i++) {
                un.add(a[i]);
            }
            for (int j = 0; j < m; j++) {
                un.add(b[j]);
            }

            for (int ele: un) {
                System.out.print(ele + " ");
            }
    }
}
