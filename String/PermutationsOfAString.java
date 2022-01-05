import java.util.*;
public class PermutationsOfAString {

    public static void main(String[] args) {
        String S = "ABC";
        List<String> ls = find_permutation(S);
        System.out.println(Arrays.toString(ls.toArray()));
    }

        static List<String> find_permutation(String S) {
            // Code here
            List<String> lsAns = new ArrayList<>();
            List<String> ls = printPermutation(S, "", lsAns);
            Collections.sort(ls);
            return ls;
        }

        static List<String> printPermutation(String S, String str, List<String> lsAns) {


            if (S.length() == 0) {
                lsAns.add(str);
            }

            String lstr;
            String rstr;
            String cstr;
            for (int i = 0; i < S.length(); i++) {
                char ch = S.charAt(i);
                lstr = S.substring(0, i);
                rstr = S.substring(i+1);
                cstr = lstr + rstr;

                printPermutation(cstr, str + ch, lsAns);
            }
            return lsAns;
        }
}
