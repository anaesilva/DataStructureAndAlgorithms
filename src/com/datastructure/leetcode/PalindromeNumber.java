package com.datastructure.leetcode;

// https://leetcode.com/problems/palindrome-number/
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        boolean output = false;

        String y = String.valueOf(x);

        char[] charArray = y.toCharArray();

        for(int i = 0, j = charArray.length - 1; i < j; i++, j--) {
          if (charArray[i] == charArray[j]) {
              output = true;
          } else {
              output = false;
          }
        }

      System.out.println("output: " + output);
        return output;
    }
}
