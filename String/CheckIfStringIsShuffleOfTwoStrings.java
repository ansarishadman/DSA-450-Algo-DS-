import java.util.Arrays;

public class CheckIfStringIsShuffleOfTwoStrings {
    public static void main(String[] args) {
        String s1 = "Shad";
        String s2 = "mna";
        String s3 = "Shadman";

        boolean isShuffle = checkShuffle(s1, s2, s3);
        if (isShuffle)
            System.out.println("The String is shuffle of two strings!");
        else
            System.out.println("The String is not a shuffle of two strings!");
    }

    static boolean checkShuffle(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length())
            return false;
        s1 = sortString(s1);
        s2 = sortString(s2);
        s3 = sortString(s3);

        int i = 0, j = 0, k = 0;
        while (k != s3.length()) {
            if (i < s1.length() && s1.charAt(i) == s3.charAt(k))
                i++;
            else if (j < s2.length() && s2.charAt(j) == s3.charAt(k))
                j++;
            else
                return false;
            k++;
        }
        if (i < s1.length() || j < s2.length())
            return false;
        return true;
    }

    static String sortString(String s) {
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        s = String.valueOf(charArr);
        return s;
    }
}
