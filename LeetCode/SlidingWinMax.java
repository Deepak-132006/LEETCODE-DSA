package LeetCode;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWinMax {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int right = k - 1;
        int[] result = new int[nums.length - k + 1];
        int i = 0;
        Deque<Integer> dq = new ArrayDeque<>();
        for (int left = 0; i < nums.length; i++) {
            if (right - left + 1 == k) {
                System.out.println("Window: " + i);
                
            }
            right++;
        }
        for (int j : result) {
            System.err.println(j);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;
        System.out.println(new SlidingWinMax().maxSlidingWindow(nums, k));
    }
}