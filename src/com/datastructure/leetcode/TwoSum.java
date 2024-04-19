package com.datastructure.leetcode;

import java.util.HashMap;
// https://leetcode.com/problems/two-sum/description/

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int[] newArray = new int[2];

        for (int i = 0; i < nums.length; i++) {

            if (hashMap.containsKey(nums[i])) {
             System.out.println("(nums[i]) -> " + (nums[i]));
             System.out.println("hashMap.containsKey(nums[i]) -> " + hashMap.containsKey(nums[i]));
             newArray[0] = hashMap.get(nums[i]);
             newArray[1] = i;
            }
            hashMap.put(target - nums[i], i);
//            2,7,11,15 -> (9-2=7, i = 0) (9-7=2, i = 1) (9-11=-2, i = 2) (9-15=-6, i = 3)
            System.out.println("Resultado: " + hashMap.put(target - nums[i], i));
        }

        System.out.println("key, value: " + ((HashMap<Integer, Integer>) hashMap));
        System.out.println("Get value " + hashMap.get(2));
        System.out.println(hashMap.containsKey(11));

        for (int x : newArray) {
            System.out.println("index: " + newArray[x]);
        }
        return newArray;
    }
}
