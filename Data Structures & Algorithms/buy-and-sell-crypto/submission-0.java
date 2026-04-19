class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int res = 0;
        for(int i = 0; i < prices.length; i++){
            for(int j = i + 1; j < prices.length; j++){
                profit = prices[j] - prices[i];
                res = Math.max(profit, res);
            }
        }
        if(res < 0){
            return 0;
        } else {
            return res;
        }
    }
}
