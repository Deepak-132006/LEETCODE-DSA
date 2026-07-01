package LeetCode;

public class SquareOfArray {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] result = new int[nums.length];
        int index = result.length - 1;

        while (left <= right) {
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                int square = nums[right] * nums[right];
                result[index] = square;
                right--;
            } else {
                int square = nums[left] * nums[left];
                result[index] = square;
                left++;
            }
            index--;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { -4, -1, 0, 3, 10 };
        // [0,1,9,16,100]
        new SquareOfArray().sortedSquares(nums);
    }
}
