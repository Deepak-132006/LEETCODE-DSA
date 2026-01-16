package LeetCode;

public class MinimumValue {
    public int minStartValue(int[] nums) {
        int sum = 0, min = 0;
        for (int n : nums) {
            sum += n;
            min = Math.min(min, sum);
        }
        return 1 - min;
    }

    public static void main(String[] args) {
        MinimumValue obj = new MinimumValue();
        int[] nums = {-3,2,-3,4,2};
        System.out.println(obj.minStartValue(nums));
    }
}

