class Solution {
    public int maxProfit(int k, int[] prices) {
        if (prices == null || prices.length == 0 || k == 0) return 0;

        int n = prices.length;

        // If k is large, it's same as unlimited transactions
        if (k >= n / 2) {
            int profit = 0;
            for (int i = 1; i < n; i++) {
                if (prices[i] > prices[i - 1]) {
                    profit += prices[i] - prices[i - 1];
                }
            }
            return profit;
        }

        int[] buy = new int[k + 1];
        int[] sell = new int[k + 1];

        for (int t = 1; t <= k; t++) {
            buy[t] = -prices[0];
            sell[t] = 0;
        }

        for (int i = 1; i < n; i++) {
            int price = prices[i];
            for (int t = 1; t <= k; t++) {
                buy[t] = Math.max(buy[t], sell[t - 1] - price);
                sell[t] = Math.max(sell[t], buy[t] + price);
            }
        }

        return sell[k];
    }
}
