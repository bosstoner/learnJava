/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
*/
// Solution complexity:

import java.util.HashMap;
import java.util.Map;

class TwoSumOnePassHashTable {
    public static void main (String[] args) {
        int[] nums = {1,7,11,15};
        int target = 9;

        try {
            int[] fina = twoSum(nums, target);
            System.out.println("[" + fina[0] +"," + fina[1] + "]");
        } catch (IllegalArgumentException e) {
            System.out.println("No solution found");
        } finally {
            System.out.println("Final message");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }
        throw new IllegalArgumentException(); // Throw an exception if no solution found
    }
}