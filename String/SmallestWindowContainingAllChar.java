import java.util.*;
public class SmallestWindowContainingAllChar {
    public static void main(String[] args) {
        String str = "AABBBCBBAC";
        System.out.println("smallest window => " + findSubString(str));
    }

    static String findSubString( String str) {
        // Your code goes here
        Map<Character, Integer> map = new HashMap<>();
        Set<Character> set = new HashSet<>();

        for (char c: str.toCharArray()) set.add(c);

        int i = -1, j = -1;
        String res = str;

        while (i < str.length() - 1 && j < str.length() - 1) {
            while (i < str.length() - 1 && map.size() < set.size()) {
                i++;
                char c = str.charAt(i);
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            while (j < i && map.size() == set.size()) {
                String temp = str.substring(j+1, i+1);
                if (temp.length() < res.length()) {
                    res = temp;
                }
                j++;
                char c = str.charAt(j);
                if (map.get(c) == 1) map.remove(c);
                else map.put(c, map.get(c) - 1);
            }
        }

        return res;
    }
}
