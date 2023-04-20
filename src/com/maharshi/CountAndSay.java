package com.maharshi;

public class CountAndSay {

    public static String countAndSay(int n) {
        return generateResult("1", 1, n);
    }

    public static String generateResult(String str, int i, int n) {
        if (n == 1)
            return "1";
        String result;
        if (str.equals("1"))
            result = "11";
        else {
            StringBuilder tempStr = new StringBuilder();
            int count = 1;
            for (int j = 0; j < str.length() - 1; j++) {
                if (str.charAt(j) == str.charAt(j + 1))
                    count++;
                else {
                    tempStr.append(count).append(str.charAt(j));
                    count = 1;
                }

            }
            if (count == 1)
                tempStr.append("1").append(str.charAt(str.length() - 1));
            else
                tempStr.append(String.valueOf(count)).append(str.charAt(str.length() - 1));
            result = tempStr.toString();
        }
        i++;
        if (i == n)
            return result;
        return generateResult(result, i, n);
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(5));
    }

}
