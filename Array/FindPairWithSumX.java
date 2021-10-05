import java.util.HashMap;

class FindPairsWithSumX {
    
    static int arr[] = new int[]{1, 5, 7, -1, 5};
    public static void main(String[] args) {

        int sum = 6;
        System.out.println( "Count of pairs is " + getPairsCount(arr.length, sum));
    }


    static int getPairsCount(int n, int sum) {

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {

            if (!hm.containsKey(arr[i]))
                hm.put(arr[i], 0);

            hm.put(arr[i], hm.get(arr[i]) + 1);
        }
        int pairCount = 0;

        for (int i = 0; i < n; i++) {
            if (hm.get(sum - arr[i]) != null)
                pairCount += hm.get(sum - arr[i]);

            if (sum - arr[i] == arr[i])
                pairCount--;
        }

        return pairCount / 2;
    }

}