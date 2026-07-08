class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int sell =0;
        int profit =0;
        for(int p: prices){
            profit = Math.max(profit,p-buy);
            buy = Math.min(buy,p);
        }
        return profit;
    }
}
