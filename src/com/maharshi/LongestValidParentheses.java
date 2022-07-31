package com.maharshi;

public class LongestValidParentheses {
	public static int longestValidParentheses(String s) {

		int open = 0;
		int close = 0;
		int max = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(') {
				open++;
			} else {
				close++;
			}
			if (open == close) {
				max = Math.max(max, 2 * open);
			}
			if (close > open) {
				open = 0;
				close = 0;
			}
		}
		open = 0;
		close = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			if (c == '(') {
				open++;
			} else {
				close++;
			}
			if (open == close) {
				max = Math.max(max, 2 * open);
			}
			if (open > close) {
				open = 0;
				close = 0;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println(longestValidParentheses("(()"));
	}

}
