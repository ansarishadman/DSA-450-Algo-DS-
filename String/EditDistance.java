public class EditDistance {
    public static void main(String[] args) {
        String s = "Shadman";
        String jm = "Javeria";

        int result = editDistance(s, jm);
        System.out.println("The distance is " + result); // Output -> 7
    }

        static int editDistance(String s, String jm) {
            // Code here
            int m = s.length();
            int n = jm.length();


            int[][] dp = new int[m+1][n+1];
            for (int i = 0; i <= m; i++) {
                for (int j = 0; j <= n; j++) {
                    if (i == 0) {
                        dp[i][j] = j;
                    }
                    else if (j == 0) {
                        dp[i][j] = i;
                    }
                    else if (s.charAt(i-1) == jm.charAt((j-1))) {
                        dp[i][j] = dp[i-1][j-1];
                    } else {
                        int refmin = Math.min(dp[i][j-1], dp[i-1][j]);
                        dp[i][j] = 1 + Math.min(refmin, dp[i-1][j-1]);
                    }
                }
            }
            return dp[m][n];
        }
}
