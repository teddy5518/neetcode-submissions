class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, count2 = 0;

        for (int num : nums) {
            if (num == 0) {
                count2 = Math.max(count, count2);
                count = 0;    
            } else {
                count++;
            }
        }
        return Math.max(count, count2);
    }
}