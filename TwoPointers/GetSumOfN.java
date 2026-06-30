package TwoPointers;

import java.util.Arrays;

public class GetSumOfN {
    public void add(int[] arr, int k) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == k) {
                System.out.println(arr[left] + " " + arr[right]);
            } else if (sum < k) {
                left++;
            } else {
                right--;
            }

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 12, 3, 4, 8, 17, 11, 9 };
        int k = 20;
        new GetSumOfN().add(arr, k);
    }
}