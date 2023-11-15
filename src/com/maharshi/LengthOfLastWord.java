package com.maharshi;

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {

        int index = s.length() - 1;
        int length = 0;

        while (s.charAt(index) == ' ')
            index--;

        while (index != -1 && s.charAt(index) != ' ') {
            index--;
            length++;
        }

        return length;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("luffy"));
    }

}
