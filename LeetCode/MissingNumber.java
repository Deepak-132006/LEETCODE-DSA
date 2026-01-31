package LeetCode;

public class MissingNumber {
        public int missingNumber(int[] nums) {
        int n = nums.length;
        int expect = n * (n + 1) / 2;
        int actual = 0;

        for (int num : nums) {
            actual += num;
        }
        int result = expect - actual;
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {0, 3, 1};
        MissingNumber obj = new MissingNumber();
        System.out.println(obj.missingNumber(nums));

    }
}
