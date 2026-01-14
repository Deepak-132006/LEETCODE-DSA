package SlidingWindow;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println(maxSumSubarray(arr, k));
    }

    static int maxSumSubarray(int[] arr, int k) {
        int windowSum = 0, maxSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        maxSum = windowSum;

        for (int end = k; end < arr.length; end++) {
            windowSum += arr[end] - arr[end - k]; 
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}

