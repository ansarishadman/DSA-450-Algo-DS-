import java.util.HashMap;
import java.util.Map;

public class FindDupesInString {
    public static void main(String[] args) {
        String str = "shadman ansari";
        HashMap<Character, Integer> hmap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (!hmap.containsKey(str.charAt(i))) {
                hmap.put(str.charAt(i), 1);
            } else {
                hmap.put(str.charAt(i), hmap.get(str.charAt(i)) + 1);
            }
        }

        for (Map.Entry mapEle: hmap.entrySet()) {
            char key = (char)mapEle.getKey();
            int value = (int)mapEle.getValue();

            if (value > 1) {
                System.out.println(key + " ,contains times = " + value);
            }
        }
    }
}