package Practice;

public class Practice {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = 0;

        for(int i = 0; i < nums.length; i++) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                right++;
                left++;
            } else {
                right++;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(new Practice().removeElement(nums, val));
    }
}
