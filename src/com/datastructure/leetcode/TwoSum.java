package com.datastructure.leetcode;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int[] newArray = new int[2];

        for(int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], i);
        }

        System.out.println("key, value: " + ((HashMap<Integer, Integer>) hashMap));
        System.out.println("Get value " + hashMap.get(2));
        System.out.println(hashMap.containsKey(11));


        int dif = 0;

        for (int i = 0; i < nums.length; i++) {
            dif = target - nums[i];

            if (hashMap.containsKey(dif) && dif + nums[i] == target) {
                newArray = new int[]{hashMap.get(dif), hashMap.get(nums[i])};
            }
        }


        for (int x : newArray) {
            System.out.println("new: " + newArray[x]);
        }
        return newArray;
    }
}
