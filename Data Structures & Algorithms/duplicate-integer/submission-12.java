class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Hashset
        // check if the hashset already has the element
        // if yes then return the true
        // if not put element into the hashset 
        HashSet<Integer> bucket = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (bucket.contains(nums[i])) return true;
            bucket.add(nums[i]);
        }

        return false;
    }
}