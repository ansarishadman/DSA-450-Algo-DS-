import java.util.*;
public class BalancedParanthesis {
    public static void main(String[] args) {
        String x = "[{()}]";
        boolean ans = ispar(x);

        if (ans == true) {
            System.out.println("Balanced Paranthesis");
        } else {
            System.out.println("Unbalanced Paranthesis");
        }
    }

        //Function to check if brackets are balanced or not.
        static boolean ispar(String x) {
            // add your code here
            Stack<Character> st = new Stack<>();

            for (int i = 0; i < x.length(); i++) {
                char ch = x.charAt(i);

                if (ch == '[' || ch == '{' || ch == '(') {
                    st.push(ch);
                } else if (st.empty()) {
                    return false;
                } else {
                    if (ch == ')' && st.peek() == '(') {
                        st.pop();
                    } else if (ch == ']' && st.peek() == '[') {
                        st.pop();
                    } else if (ch == '}' && st.peek() == '{') {
                        st.pop();
                    } else {
                        return false;
                    }
                }
            }
            if (st.size() == 0) {
                return true;
            }
            return false;
        }
}
