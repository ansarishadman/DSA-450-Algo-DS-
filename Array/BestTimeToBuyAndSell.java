public class BestTimeToBuyAndSell {
    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        int profit = maxProfit(prices);
        System.out.println("Max Profit is " + profit);
    }

    static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int n = prices.length;
        int maxProfit = 0;
        for (int i = 0; i < n; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if ((prices[i] - minPrice) > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }
}
