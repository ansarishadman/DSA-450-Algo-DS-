import java.util.Random;

// kth Max And Min Element In Array
// kthSmallest -> randomPartition -> partition -> recursive <-|
public class kthSmallestElementInArray {
    public static void main(String[] args) {
        int arr[] = { 12, 36, 4, 56, 23, 16};
        int k = 2;
        int l = 0;
        int r = arr.length -1;
        Solution sol = new Solution();
        // [4, 12, 16, 23, 36, 56]
        System.out.print(sol.kthSmallest(arr, l, r, k));
    }
}

 class Solution {
     void swap (int arr[], int l, int r) {
         int temp = arr[l];
         arr[l] = arr[r];
         arr[r] = temp;
     }

     int randomPartition(int arr[], int l, int r) {
         int n = r - l + 1;
         Random rd  = new Random();
         int pivot = rd.nextInt(n);
         swap(arr, l + pivot, r);
         return partition(arr, l, r);
     }

     int kthSmallest(int arr[], int l, int r, int k) {
         // if k is smaller than number of elements in an array
         if (k > 0 && k <= r-l+1) {
             // find a position for random partition
             int pos = randomPartition(arr, l, r);

             // if this pos gives kth smallest element, then return
             if (pos-l == k-1)
                 return arr[pos];

             // else recurse for the left and right half accordingly
             if (pos-l > k-1)
                 return kthSmallest(arr, l, pos-1, k);
             return kthSmallest(arr, pos+1, r, k-pos+l-1);
         }
         return Integer.MAX_VALUE;
     }

     int partition(int arr[], int l, int r) {
         int x = arr[r], i = l;
         for (int j = l; j <= r-1; j++) {
             if (arr[j] <= x) {
                 swap(arr, i, j);
                 i++;
             }
         }
         swap(arr, i, r);
         return i;
     }
}
