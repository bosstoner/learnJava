/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
*/
// Solution complexity: O(n)

import java.util.HashSet;

class ContainsDuplicateHashSet {
    public static void main (String[] args) {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};

        // Needs new instance because containsDuplicate method is not static
        ContainsDuplicateHashSet instance = new ContainsDuplicateHashSet();
        boolean fina = instance.containsDuplicate(nums);
        System.out.println(fina);
    }

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num))
                return true;
            seen.add(num);
        }
        return false;
    }
}