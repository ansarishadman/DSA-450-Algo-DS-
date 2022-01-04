public class MinFlipsForAlternateBinaryString {
    public static void main(String[] args) {
        String S = "001";
        System.out.println(minFlips(S));
    }

    static int minFlips(String S) {
        // Code here
        int minFlipVal = Math.min(getMinFlip(S, '0'), getMinFlip(S, '1'));
        return minFlipVal;
    }

    static int getMinFlip(String S, char expVal) {
        int count = 0;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) != expVal) {
                count++;
            }
            expVal = flipVal(expVal);
        }
        return count;
    }

    static char flipVal(char expVal) {
        return (expVal == '0' ? '1' : '0');
    }
}
