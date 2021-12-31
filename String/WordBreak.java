import java.util.*;
public class WordBreak {
    public static void main(String[] args) {
        List<String> B = Arrays.asList("Mah", "Shadman", "veen");
        String A = "Mahveen";
        int ans = wordBreak(A, B);
        System.out.println("Value is " + ans);
    }

        public static int wordBreak(String A, List<String> B )
        {
            //code here
            int[] dp = new int[A.length()];

            for (int i = 0; i < dp.length; i++) {
                for (int j = 0; j <= i; j++) {
                    String str = A.substring(j, i+1);
                    if (B.contains(str)) {
                        if (j > 0) {
                            dp[i] += dp[j-1];
                        } else {
                            dp[i] += 1;
                        }
                    }
                }
            }
            return dp[A.length() - 1] > 0 ? 1 : 0;
        }
}
