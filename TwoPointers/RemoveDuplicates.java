package TwoPointers;

import java.util.Arrays;

public class RemoveDuplicates {
    public static int[] Removeduplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return Arrays.copyOf(nums, i + 1);
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 4, 4, 5, 6, 6, 7, 9 };
        RemoveDuplicates obj = new RemoveDuplicates();
        System.out.println(Arrays.toString(obj.Removeduplicates(nums)));
    }
}
