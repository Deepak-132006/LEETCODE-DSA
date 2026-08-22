package Practice;

public class RatanStock {
    public int bestPrice(int[] stocks) {
        int bestPrice = 0;
        int currentPrice = 0;
        for(int i = 0; i < stocks.length; i++){
            currentPrice = stocks[i];
            bestPrice = Math.max(currentPrice, bestPrice);
        }
        return bestPrice;
    }
    public static void main(String[] args) {
        int[] stocks = {1, 9, 2, 11, 1, 9, 2};
        System.out.println(new RatanStock().bestPrice(stocks));
    }
}