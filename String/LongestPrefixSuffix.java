public class LongestPrefixSuffix {
    public static void main(String[] args) {
        String s = "abab";
        int ans = lps(s);
        System.out.println("Count = " + ans);
    }

    static int lps(String s) {
        int i = 0, j = 1, n = s.length();
        int[] lps = new int[n];
        lps[0] = 0;
        while (j < n) {
            if (s.charAt(i) == s.charAt(j)) {
                lps[j] = i + 1;
                j++;
                i++;
            } else {
                if (i == 0) {
                    lps[j] = 0;
                    j++;
                } else {
                    i = lps[i - 1];
                }
            }
        }
        return lps[n - 1];
    }
}
