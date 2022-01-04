public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String ans = longestCommonPrefix(strs);
        System.out.println("Longest prefix is => " + ans);
    }

    static String longestCommonPrefix(String[] strs) {
        String smallstr = "";
        int smlen = 256;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < smlen) {
                smlen = strs[i].length();
                smallstr = strs[i];
            }
        }
        String[] strArr = findSubstring(smallstr);
        String ans = "";

        for (int j = 0; j < strArr.length; j++) {
            boolean iscommon = true;
            String checkstr = strArr[j];
            for (int k = 0; k < strs.length; k++) {
                if (!strs[k].substring(0,checkstr.length()).equals(checkstr)) {
                    iscommon = false;
                    break;
                }
            }
            if (iscommon) {
                ans = checkstr;
                break;
            }
        }
        return ans;
    }

    static String[] findSubstring(String str) {
        String[] substr = new String[str.length()];
        int k = 0;
        for (int i = str.length(); i > 0; i--) {
            substr[k++] = str.substring(0, i);
        }

        return substr;
    }
}
