package com.maharshi;

public class StrStr {
	public static int strStr(String haystack, String needle) {

		if (needle.length() == 0)
			return 0;
		for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
			boolean found = true;
			for (int j = 0; j < needle.length(); j++) {
				if (haystack.charAt(i) != needle.charAt(j)) {
					found = false;
					i = i - j;
					break;
				} else {
					i++;
				}
			}
			if (found) {
				return i - needle.length();
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(strStr("mississippi", "issip"));
	}

}
