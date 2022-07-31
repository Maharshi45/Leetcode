package com.maharshi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LetterCombinations {
	public static List<String> letterCombinations(String digits) {

		String[] strArr = new String[] { "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

		List<String> strList = new ArrayList<String>();

		for (int i = 0; i < digits.length(); i++) {
			String s = strArr[Integer.parseInt(Character.toString(digits.charAt(i))) - 2];
			if (strList.size() == 0) {
				for (int j = 0; j < s.length(); j++) {
					strList.add(Character.toString(s.charAt(j)));
				}
			} else {
				List<String> tempList = new ArrayList<String>();
				for (int j = 0; j < strList.size(); j++) {
					for (int k = 0; k < s.length(); k++) {
						tempList.add(strList.get(j) + s.charAt(k));
					}
				}
				strList = tempList;
			}
		}
		return strList;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(letterCombinations("234").toArray()));
	}

}