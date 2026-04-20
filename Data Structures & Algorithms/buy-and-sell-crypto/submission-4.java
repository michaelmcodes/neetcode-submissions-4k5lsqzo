class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int profit = 0;
        int l = 0;

        for(int r = 1; r < prices.length; r++){
            if(prices[r] > prices[l]){
                profit = prices[r] - prices[l];
                max = Math.max(max, profit);
            }
            else{
                l = r;
            }
        }
        return max;
    }
}
