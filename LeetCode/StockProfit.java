package LeetCode;

public class StockProfit {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int price : prices) {
            if (price < min) {
                min = price;
            } else if (price - min > max) {
                max = price - min;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        StockProfit obj = new StockProfit();
        int[] prices = {7,1,5,3,6,4};
        System.out.println(obj.maxProfit(prices));
    }
}
