package TwoPointers;

import java.util.Arrays;

public class MergeArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m;

        System.out.println(index);
        for (int i = index; i < nums1.length; i++) {
            nums1[i] = nums2[i - index];
        }
                Arrays.sort(nums1);

    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 2, 5, 6 };
        int n = 3;
        int m = 3;
        new MergeArray().merge(nums1, m, nums2, n);
    }
}
