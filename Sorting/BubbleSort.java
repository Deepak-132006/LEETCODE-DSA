package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public int[] bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped = false;
        int temp;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] nums = {5, 1, 4, 2, 8};
        BubbleSort obj = new BubbleSort();
        System.out.println(Arrays.toString(obj.bubbleSort(nums)));
    }
}

