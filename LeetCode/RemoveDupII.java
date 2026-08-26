package LeetCode;

public class RemoveDupII {
    public int removeDuplicates(int[] nums) {
        int insert = 2;
        for (int i = 2; i < nums.length; i++){
            if(nums[i] != nums[insert - 2]){
                nums[insert] = nums[i];
                insert++;
            }
        }
        for(int num : nums) {
            System.out.print(num);
        }
        System.out.println("\n");
        return insert;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2, 2, 3 };
        System.out.println(new RemoveDupII().removeDuplicates(nums));
    }
}