class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Hashset
        // Time complexity: O(n)
        // Space complexity: O(n)
        
        // check if the hashset already has the element
        // if yes then return the true
        // if not put element into the hashset 
        
        HashSet<Integer> seen = new HashSet<Integer>();

        for (int num : nums) {
            if (seen.contains(num)) return true;

            seen.add(num);
        }

        return false;
    }
}