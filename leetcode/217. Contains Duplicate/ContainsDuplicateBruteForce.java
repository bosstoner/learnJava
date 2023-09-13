/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
*/
// Solution complexity: O(n^2)

class ContainsDuplicateBruteForce {
    public static void main (String[] args) {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};

        // Needs new instance because containsDuplicate method is not static
        ContainsDuplicateBruteForce instance = new ContainsDuplicateBruteForce();
        boolean fina = instance.containsDuplicate(nums);
        System.out.println(fina);
    }

    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }
}