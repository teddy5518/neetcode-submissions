class Solution {
    public boolean hasDuplicate(int[] nums) {
        // put every numbers in nums into the hashset
        // if hash set count is not equal as the nums length then return false
        Set<Integer> seen = new HashSet<>();
        
        for (int i : nums) {
            System.out.println(i);
            seen.add(i);
        }

        System.out.println(seen);
        return seen.size() != nums.length;
    }
}