class Solution {
    public int maxProfit(int[] prices) {
        // Code here
        int max_profit=0;
        int diff=0;
        //optimised way
        // for(int i=0;i<prices.length;i++)
        // {
        //     for(int j=i+1;j<prices.length;j++)
        //     {
        //         diff=prices[j]-prices[i];
        //         max_profit=Math.max(diff,max_profit);
        //     }
        // }
        
        //optimised way to solve this problem
        int min=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<prices.length;i++)
        {
            min=Math.min(min,prices[i]);
            profit=prices[i]-min;
            max_profit=Math.max(profit,max_profit);
        }
        return max_profit;
    }
}