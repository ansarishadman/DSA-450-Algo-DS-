import java.util.LinkedList;
import java.util.Queue;

public class CheckOneStringRotationOfAnother {
    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "CDAB";
        boolean isRotation = checkRotation(s1, s2);
        if (isRotation) {
            System.out.println("String is a rotation of another!");
        } else {
            System.out.println("String is not a rotation of another!");
        }
    }

    static boolean checkRotation(String s1, String s2) {
        Queue<Character> q1 = new LinkedList<>();
        Queue<Character> q2 = new LinkedList<>();
        int k = s2.length();

        for (int i = 0; i < s1.length(); i++) {
            q1.add(s1.charAt(i));
        }

        for (int j = 0; j < s2.length(); j++) {
            q2.add(s2.charAt(j));
        }

        if (s1.length() != s2.length())
            ;
        while(k > 0) {
            k--;
            char ch = q2.peek();
            q2.remove();
            q2.add(ch);
            if (q2.equals(q1))
                return true;
        }
        return false;
    }
}
