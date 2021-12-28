import java.util.Arrays;

public class AllSubsequenceOfString {
    public static void main(String[] args) {
        String str = "Shadman";
        String ans[] = findSubsequences(str);
        System.out.println(Arrays.toString(ans));
    }

    static String[] findSubsequences(String str) {
        if (str.length() == 0) {
            String ans[] = {""};
            return ans;
        }

        String smallAns[] = findSubsequences(str.substring(1));
        String ans[] = new String[2 * smallAns.length];

        int k = 0;
        for (int i = 0; i < smallAns.length; i++) {
            ans[k] = smallAns[i];
            k++;
        }

        for (int j = 0; j < smallAns.length; j++) {
            ans[k] = str.charAt(0) + smallAns[j];
            k++;
        }
        return ans;
    }
}
