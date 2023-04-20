package com.maharshi;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis1 {

    public static List<String> generateParenthesis(int n) {

        List<String> list = new ArrayList<>();

        if (n == 0)
            return list;

        for (long i = 0; i < Math.pow(2, 2d * n); i++) {

            String tempStr1 = getBinary(i, 2 * n);

            String tempStr2 = convertToParentheses(tempStr1);

            if (isValid(tempStr2)) {
                list.add(tempStr2);
            }
        }

        return list;

    }

    private static String convertToParentheses(String str) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '0')
                result.append('(');
            else
                result.append(')');
        }

        return result.toString();

    }

    public static String getBinary(long num, int format) {

        String binary = Long.toBinaryString(num);

        long b = Long.parseLong(binary);

        return String.format("%0" + format + "d", b);
    }

    public static boolean isValid(String s) {

        if (s.length() % 2 != 0)
            return false;

        int open = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(')
                open++;
            else
                open--;
            if (open < 0)
                return false;
        }
        return open == 0;
    }

    public static void main(String[] args) {

        generateParenthesis(4).forEach(System.out::println);

    }

}
