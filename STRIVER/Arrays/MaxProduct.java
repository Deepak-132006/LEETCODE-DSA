package STRIVER.Arrays;

public class MaxProduct {
    public int maxProduct(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }

        int currentMax = nums[0];
        int maxProduct = nums[0];
        int currentMin = nums[0];

        for( int i = 1; i < nums.length; i++){
            int currentValue = nums[i];

            int previousMax = currentMax;
            int previousMin = currentMin;

            currentMax = Math.max(
                currentValue, Math.max(previousMax * currentValue, previousMin * currentValue)
            );

            currentMin = Math.min(
                currentValue, Math.min(previousMin * currentValue, previousMax * currentValue)
            );

            if(currentMax > maxProduct) {
                maxProduct = currentMax;
            }
        }
        return maxProduct;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, -2, 4 };
        System.out.println(new MaxProduct().maxProduct(nums));
    }
}
