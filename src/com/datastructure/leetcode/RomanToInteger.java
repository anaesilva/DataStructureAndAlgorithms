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

        char[] convertToChar = s.toCharArray();

        for (int i = 0; i < convertToChar.length - 1; i++) {

            if (number.containsKey(convertToChar[i])) {
                output += number.get(convertToChar[i]);
                System.out.println(number.get(convertToChar[i]));
            } else if (convertToChar[i] == 'I' && (convertToChar[i + 1] == 'V' || convertToChar[i + 1] == 'X')) {
                output += number.get(convertToChar[i + 1]) - number.get(convertToChar[i]);
                System.out.println("Output 1: " + (number.get(convertToChar[i + 1]) - number.get(convertToChar[i])));
            } else if (convertToChar[i] == 'X' && (convertToChar[i + 1] == 'L' || convertToChar[i + 1] == 'C')) {
                output += number.get(convertToChar[i + 1]) - number.get(convertToChar[i]);
                System.out.println("Output 1: " + (number.get(convertToChar[i + 1]) - number.get(convertToChar[i])));

            } else if (convertToChar[i] == 'C' && (convertToChar[i + 1] == 'D' || convertToChar[i + 1] == 'M')) {
                output += number.get(convertToChar[i + 1]) - number.get(convertToChar[i]);
                System.out.println("Output 1: " + (number.get(convertToChar[i + 1]) - number.get(convertToChar[i])));

            }


            System.out.println("Output: " + output);
        }
        return output;
    }
}