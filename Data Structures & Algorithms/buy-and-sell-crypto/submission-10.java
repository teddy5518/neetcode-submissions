class Solution {
    public int maxProfit(int[] prices) {
        // Two Pointers
        // Create pointers
        int p1 = 0, p2 = 1;
        int maxP = 0;

        while (p2 < prices.length) {
            if (prices[p2] > prices[p1]) {
                int profit = prices[p2] - prices[p1];
                maxP = Math.max(maxP, profit);
            } else {
                p1 = p2;
            }

            p2++;
        }

        return maxP;
    }
}
