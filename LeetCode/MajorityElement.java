package LeetCode;

import java.util.Arrays;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int current = 0;
        for(int num : nums){
            if(count == 0){
                current = num;
            }
            if(num == current){
                count++;
            } else {
                count--;
            }
        }
        return current;
    }
    public static void main(String[] args) {
        MajorityElement obj = new MajorityElement();
        int[] nums = {3, 2, 3};
        System.out.println(obj.majorityElement(nums));
    }
}
