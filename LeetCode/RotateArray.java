package LeetCode;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] temp = new int[nums.length];

        for (int i = 0; i < k; i++) {
            temp[i] = nums[n - k + i];
        }
        for (int i = k; i < nums.length; i++) {
            temp[i] = nums[i - k];
        }
        for( int i = 0; i < nums.length; i++){
            nums[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        RotateArray obj = new RotateArray();
        obj.rotate(nums, k);
    }
}
