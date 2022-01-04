import java.util.*;
public class SecondMostRepeatedString {
    public static void main(String[] args) {
        String arr[] = {"aaa", "bbb", "ccc", "bbb", "aaa", "aaa"};
        int N = arr.length;

        System.out.println("Second most repeated string is => " + secFrequent(arr, N));
    }

    static String secFrequent(String arr[], int N)
    {
        // your code here
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < N; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                int count = map.get(arr[i]);
                map.put(arr[i], count+1);
            }
        }

        ArrayList<Integer> list = new ArrayList<Integer>(map.values());
        Collections.sort(list);
        int n = list.size();
        return getKey(map, list.get(n-2));
    }

    static String getKey(Map<String,Integer> map, Integer value) {
        for (String key: map.keySet()) {
            if (value.equals(map.get(key))) {
                return key;
            }
        }
        return null;
    }
}
