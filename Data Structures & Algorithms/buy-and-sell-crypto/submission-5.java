class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
    
        for (int i = 1; i < prices.length; i++) {
            for (int j = i; j >= 0; j--) {
                int current = prices[i] - prices[j];
                if (current > max) max = current;
            }
        }

        return max;
    }
}