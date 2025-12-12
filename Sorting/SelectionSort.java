package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public int[] selectionSort(int[] arr) {
        int n = arr.length;
        int temp;
        int minIndex;
        for (int i = 0; i < n - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        SelectionSort obj = new SelectionSort();
        int[] nums = { 5, 3, 1, 4, 2 };
        System.out.print(Arrays.toString(obj.selectionSort(nums)));
    }
}