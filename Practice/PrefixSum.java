package Practice;

import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {

        int[] nums = { 2, 4, 6, 8 };
        int[] prefix = new int[nums.length];

        prefix[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        System.out.println(Arrays.toString(prefix));
    }
}
