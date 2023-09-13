/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
*/

import java.util.Arrays;

class ContainsDuplicateSorting {
    public static void main (String[] args) {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};

        // Needs new instance because containsDuplicate method is not static
        ContainsDuplicateSorting instance = new ContainsDuplicateSorting();
        boolean fina = instance.containsDuplicate(nums);
        System.out.println(fina);
    }

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1])
                return true;
        }
        return false;
    }
}