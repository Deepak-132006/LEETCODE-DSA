package LeetCode;

import java.util.Arrays;

public class Medain {
        public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];

        System.arraycopy(nums1, 0, merged, 0, nums1.length);
        System.arraycopy(nums2, 0, merged, nums1.length, nums2.length);

        Arrays.sort(merged);

        int n = merged.length;
        double medain = (n % 2 == 1) ? (merged[n / 2]) : (merged[n/2 - 1] + merged[n/2] ) / 2;
        return medain;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println(findMedianSortedArrays(nums1, nums2));

    }
}
