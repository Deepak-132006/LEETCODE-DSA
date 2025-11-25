package LeetCode;

public class SubarrayEqualsK {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        int n = nums.length;
        int count = 0;
        int k = 3;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum == k)
                    count++;

            }
        }
        System.out.print(count);
    }
}
