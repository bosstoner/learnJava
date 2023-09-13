/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
*/
// Solution complexity: O(n)

import java.util.HashMap;

class ContainsDuplicateHashMap {
    public static void main (String[] args) {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};

        // Needs new instance because containsDuplicate method is not static
        ContainsDuplicateHashMap instance = new ContainsDuplicateHashMap();
        boolean fina = instance.containsDuplicate(nums);
        System.out.println(fina);
    }

    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        for (int num : nums) {
            if (seen.containsKey(num) && seen.get(num) >= 1)
                return true;
            seen.put(num, seen.getOrDefault(num, 0) + 1);
        }
        return false;
    }
}