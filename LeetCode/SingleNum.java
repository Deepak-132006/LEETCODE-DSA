package LeetCode;

public class SingleNum {
        public int singleNumber(int[] nums) {
            int result = 0;
            for(int num : nums){
                result ^= num;
            }
            return result;
    }
    public static void main(String[] args) {
        SingleNum obj = new SingleNum();
        int[] nums = {2, 2, 1};
        System.out.println(obj.singleNumber(nums));
    }
}
