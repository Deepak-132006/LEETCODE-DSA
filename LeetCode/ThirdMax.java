package LeetCode;

import java.util.TreeSet;

public class ThirdMax {
        public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();

        for(int num : nums){
            set.add(num);

            if(set.size() > 3){
                set.pollFirst();
            }
        }
        return (set.size() < 3) ? set.last() : set.first();
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1};
        ThirdMax obj = new ThirdMax();
        System.out.println(obj.thirdMax(nums));
    }
}
