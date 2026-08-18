public class StockBuyAndSell{
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};

        int minPrice = prices[0];
        int maxProfit = 0;

        for(int i=0;i<prices.length;i++){
            minPrice = Math.min(minPrice,prices[i]);
            int profit = prices[i] - minPrice;
            maxProfit = Math.max(profit,maxProfit);
        }
        System.out.println(maxProfit);
    }
}