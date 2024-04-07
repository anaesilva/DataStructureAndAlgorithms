package com.datastructure.leetcode;

import java.util.Collections;
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int[] newArray = new int[2];

        for(int i = 0; i < nums.length; i++) {
            hashMap.put(i, nums[i]);
        } int dif = 0;
        for (int i = 0; i < nums.length; i++) { dif = target - nums[i];
            if (hashMap.containsKey(dif) && dif + nums[i] == target) {
                newArray = new int[]{};break;
            }
        }

        for (int x : newArray) {
            System.out.println(newArray[x]);
        }
        return newArray;
    }
}
