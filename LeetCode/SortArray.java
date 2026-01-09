package LeetCode;

import java.util.Arrays;

public class SortArray {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    public void quickSort(int[] nums, int low, int high) {

        if (low < high) {
            int pivotIndex = partition(nums, low, high);
            quickSort(nums, low, pivotIndex - 1);
            quickSort(nums, pivotIndex + 1, high);
        }
    }

    public int partition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (nums[j] <= pivot) {
                i++;
                swap(nums, i, j);
            }
        }
        int randomIndex = low + (int) (Math.random() * (high - low + 1));
        swap(nums, randomIndex, high); // move random pivot to end
        swap(nums, i + 1, high);
        return i + 1;
    }

    public void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    public static void main(String[] args) {
        SortArray obj = new SortArray();
        int[] nums = { 5, 2, 3, 1 };
        System.out.print(Arrays.toString(obj.sortArray(nums)));
    }
}
