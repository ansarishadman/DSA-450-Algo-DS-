public class LongestCommonSubsequenceInTwoStrings {
    public static void main(String[] args) {
        String s1 = "SHADMAN", s2 = "JAVERIA";
        int x = s1.length(), y = s2.length();

        System.out.println("Longest subsequence is => " + lcs(x, y, s1, s2)); // 2
    }

    static int lcs(int x, int y, String s1, String s2) {
        // your code here
        int[][] dp = new int[x+1][y+1];

        for(int i = 0; i <= x; i++) {
            for (int j = 0; j <= y; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[x][y];
    }
}
