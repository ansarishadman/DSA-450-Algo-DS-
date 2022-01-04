import java.util.*;
public class ConvertRomanNumeralsToInteger {

    public static void main(String[] args) {
        String str = "MMCMXIII";
        System.out.println("Converted Integer is => " + romanToDecimal(str));
    }

    // Finds decimal value of a given roman numeral
    static int romanToDecimal(String str) {
        // code here
        // example roman numeral MMCMXIII
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        // System.out.println(Arrays.asList(hm));
        int res = 0;
        int n = str.length();
        for (int i = n - 1; i > 0; i--) {
            if (hm.get(str.charAt(i)) <= hm.get(str.charAt(i-1))) {
                res += hm.get(str.charAt(i-1));
            } else {
                res -= hm.get(str.charAt(i-1));
            }
        }
        res += hm.get(str.charAt(n-1));
        return res;
    }
}
