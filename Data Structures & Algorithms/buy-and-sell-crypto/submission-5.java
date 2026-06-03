class Solution {
    public int maxProfit(int[] prices) {
        // Two pointers
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        
        int l = 0, r = 1;
        int max = 0;

        while (r < prices.length) {
            if (prices[r] > prices[l]) {
                int profit = prices[r] - prices[l];
                max = Math.max(max, profit);
            } else {
                l = r;
            }

            r++;
        } 

        return max;
    }
}
