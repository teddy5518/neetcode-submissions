class Solution {
    public int maxProfit(int[] prices) {
        // Two pointers

        int p1 = 0, p2 = 1;
        int mProfit = 0;

        while (p2 < prices.length) {
            if (prices[p2] > prices[p1]) {
                int profit = prices[p2] - prices[p1];
                mProfit = Math.max(mProfit, profit);
            } else {
                p1 = p2; // move forward
            }

            p2++; //move forward
        }

        return mProfit;
    }
}
