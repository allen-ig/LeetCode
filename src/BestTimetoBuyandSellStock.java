public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        int max = 0;
        int maxCur = 0;
        for (int i = 1; i < prices.length; i++){
            max = Math.max(0, max += prices[i] - prices[i - 1]);
            maxCur = Math.max(maxCur, max);
        }
        return maxCur;
    }
}
