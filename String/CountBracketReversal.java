public class CountBracketReversal {
    public static void main(String[] args) {
        String s = "}{{}}{{{";
        System.out.println("Count = " + countRev(s));
    }

    static int countRev (String s) {
        // your code here
        int n = s.length(), count = 0, revcount = 0;
        if (n % 2 == 1) {
            return -1;
        }

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '{') {
                count++;
            } else {
                count--;
            }
            if (count < 0) {
                count = 1;
                revcount++;
            }
        }
        revcount += count/2;
        return revcount;
    }
}
