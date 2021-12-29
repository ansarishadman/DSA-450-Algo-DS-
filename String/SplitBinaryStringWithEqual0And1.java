import java.io.*;
public class SplitBinaryStringWithEqual0And1 {
        public static void main (String[] args) {
            System.out.println("GfG!");
            String str = "0111100010";
            findStringSplit(str);
        }

        static void findStringSplit(String str) {
            int l = 0, r = 0, count = 0;

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == '0') {
                    l++;
                } else {
                    r++;
                }
                if (l == r) {
                    count++;
                }
            }
            System.out.println(count);
        }

}
