package com.maharshi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSubstring {

    public static void getPermutations(List<String> words, List<String> result) {

        if (words.isEmpty()) {
            return;
        }
        for (int i = 0; i < words.size(); i++) {
            String str = words.get(i);
            words.remove(i);
            result.add(str);
            getPermutations(words, result);
        }

    }

    public static void main(String[] args) {
        String[] strArr = {"foo", "bar", "abc", "def"};
        List<String> words = new ArrayList<>();
        Collections.addAll(words, strArr);
        List<String> result = new ArrayList<>();
        getPermutations(words, result);
        for (String str : result)
            System.out.println(str);
    }

}
