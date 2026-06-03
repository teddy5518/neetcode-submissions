class Solution {
    public int maxProfit(int[] prices) {
        // Two Pointers
        // Time complexity: O(n)
        // Space complexity: O(1)
        int l = 0, r = 1;
        int max = 0;

        while (r < prices.length) {
            if (prices[l] < prices[r]) {
                int profit = prices[r] - prices[l];
                max = Math.max(profit, max);
            } else {
                l = r;
            }

            r++;
        }

        return max;
    }
}