class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, reset = 0;

        for (int num : nums) {
            if (num == 0) {
                reset = Math.max(reset, count);
                count = 0;
            } else {
                count++;
            }
        }
        return Math.max(count, reset);
    }
}