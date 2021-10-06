import java.util.*;

public class SubArrayWith0Sum {
    public static void main(String[] args) {
        int arr[] = { 8, 7, -4, -3, 3, -1};
        boolean sol = checkSumForZero(arr, arr.length);

        if (sol == true) {
            System.out.println("Zero Found!");
        } else {
            System.out.println("Zero not found!");
        }
    }


    static boolean checkSumForZero(int[] arr, int n) {
        HashSet<Integer> hs = new HashSet<Integer>();
        int sum = 0;
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            if (arr[i] == 0 || sum == 0 || hs.contains(sum)) {
                flag = true;
            } else {
                hs.add(sum);
            }
        }
        return flag;
    }
}
