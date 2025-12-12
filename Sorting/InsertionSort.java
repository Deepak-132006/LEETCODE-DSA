package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public int[] insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
    public static void main(String[] args) {
        InsertionSort obj = new InsertionSort();
        int[] arr = {5, 3, 1, 4, 8};
        System.out.print(Arrays.toString(obj.insertionSort(arr)));
    }
}
