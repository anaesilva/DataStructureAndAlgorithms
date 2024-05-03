package com.datastructure.leetcode;


import java.util.HashMap;

// https://leetcode.com/problems/roman-to-integer/description/?envType=featured-list&envId=top-google-questions?envType=featured-list&envId=top-google-questions
public class RomanToInteger {
    public int romanToInt(String s) {
        int output = 0;

        HashMap<Character, Integer> number = new HashMap<>();
        number.put('I', 1);
        number.put('V', 5);
        number.put('X', 10);
        number.put('L', 50);
        number.put('C', 100);
        number.put('D', 500);
        number.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length()) {
                if (s.charAt(i) == 'I'  && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) {
                    output += (number.get(s.charAt(i + 1)) - number.get(s.charAt(i)));
                    i++;
                } else if (s.charAt(i) == 'X'  && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) {
                    output += (number.get(s.charAt(i + 1)) - number.get(s.charAt(i)));
                    i++;
                } else if (s.charAt(i) == 'C'  && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
                    output += (number.get(s.charAt(i + 1)) - number.get(s.charAt(i)));
                    i++;
                } else {
                    output+=number.get(s.charAt(i));
                }
            } else {
                output += number.get(s.charAt(i));
            }
        }

        System.out.println("Output: " + output);
        return output;
    }
}