package com.maharshi;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis2 {

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        if (n == 0)
            return result;

        backTrackString("", 0, 0, n, result);
        return result;
    }

    public static void backTrackString(String current, int open, int close, int n, List<String> result) {
        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }
        if (open < n)
            backTrackString(current + "(", open + 1, close, n, result);
        if (close < open)
            backTrackString(current + ")", open, close + 1, n, result);
    }

    public static void main(String[] args) {

        generateParenthesis(4).stream().forEach(System.out::println);

    }

}
