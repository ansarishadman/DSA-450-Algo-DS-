import java.util.*;
import java.util.HashSet;

public class UnionAndIntersectionOfTwoSortedArrays {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 4, 5, 6, 7 };
        int n = arr1.length;
        int m = arr2.length;

        doUnion(arr1, n, arr2, m);
        doIntersection(arr1, n, arr2, m);
    }

    static void doUnion(int a[], int n, int b[], int m) {
            Set<Integer> un = new HashSet<>();
            for (int i = 0; i < n; i++) {
                un.add(a[i]);
            }
            for (int j = 0; j < m; j++) {
                un.add(b[j]);
            }

            printArray(un, "union");
    }

    static void doIntersection(int a[], int n, int b[], int m) {
        int i = 0, j = 0;
        Set<Integer> in = new HashSet<>();

        while (i < n && j < m) {
            if (a[i] < b[j]) {
                i++;
            } else if (a[i] > b[j]) {
                j++;
            } else {
                in.add(a[i]);
                i++;
                j++;
            }
        }

        printArray(in, "intersection");
    }

    static void printArray(Set<Integer> arr, String type) {
        System.out.print(type + ":");
        for (int ele: arr) {
            System.out.print(ele + " ");
        }
        System.out.println("");
    }
}
