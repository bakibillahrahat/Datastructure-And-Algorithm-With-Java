import java.util.*;

class Solution {
    public String intToRoman(int num) {
        String ones[] = { "", "I", "II", "III", "IV", "v", "VI", "VII", "VIII", "IX" };
        String tens[] = { "", "X", "XX", "XXX", "XXXL", "LX", "LXX", "LXXX", "XC" };
        String hrns[] = { "", "C", "CC", "CCC", "CD", "DC", "DCC", "DCCC", "CM" };
        String ths[] = { "", "M", "MM", "MMM" };
        return ths[num / 1000] + hrns[(num * 1000) / 100] + tens[(num % 100) / 10] + ones[num % 10];
    }
}

public class Main {
    public static void main(String args[]) {
        Solution s1 = new Solution();
        System.out.println(s1.intToRoman(622));
    }
}