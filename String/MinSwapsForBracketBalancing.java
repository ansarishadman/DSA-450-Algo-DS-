public class MinSwapsForBracketBalancing {
    public static void main(String[] args) {
        String S = "[]][][";
        System.out.println(minimumNumberOfSwaps(S));
    }

    static int minimumNumberOfSwaps(String S){
        // code here
        int count = 0, revcount = 0, n = S.length();

        for (int i = 0; i < n; i++) {
            if (S.charAt(i) == ']') {
                count++;
            } else {
                if (count > 0)
                    revcount += count;
                count -= 1;
            }
        }

        return revcount;
    }
}
