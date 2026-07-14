package LeetCode;

public class ProductLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left = 0, count = 0, product = 1;
        if (k <= 0) {
            return 0;
        }
        for (int right = 0; right < nums.length; right++) {
            product *= nums[right];
            while (product >= k) {
                product /= nums[left++];
            }
            count += (right - left + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {10,5,2,6};
        int k = 100;
        System.out.println(new ProductLessThanK().numSubarrayProductLessThanK(nums, k));
    }
}
