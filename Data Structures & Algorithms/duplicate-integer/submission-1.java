class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> numsHashSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            numsHashSet.add(nums[i]);
        }

        if (nums.length > numsHashSet.size()) {
            return true;
        } else {
            return false;
        }
    }
}