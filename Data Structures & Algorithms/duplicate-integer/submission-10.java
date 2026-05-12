class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Sorting 
        // Time complexity : O(n log n)
        // Space complexity : O(1) or O(n)

        // iterate the array
        // compare the current and previous elements
        // if equal then return true
        Arrays.sort(nums);
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) return true; 
        }    

        return false;
    }
}