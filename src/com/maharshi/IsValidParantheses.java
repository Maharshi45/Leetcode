package com.maharshi;

import java.util.ArrayList;
import java.util.List;

public class IsValidParantheses {

	public static boolean isValid(String s) {

		if (s.length() % 2 != 0)
			return false;

		List<Character> list = new ArrayList<Character>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '{' || c == '[' || c == '(')
				list.add(c);
			else {
				if (list.size() == 0)
					return false;
				int lastIndex = list.size() - 1;
				if ((c == '}' && list.get(lastIndex) == '{') || (c == ']' && list.get(lastIndex) == '[')
						|| (c == ')' && list.get(lastIndex) == '(')) {
					list.remove(lastIndex);
				} else
					return false;
			}
		}
		if (list.size() != 0)
			return false;
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isValid("(]"));
	}

}
