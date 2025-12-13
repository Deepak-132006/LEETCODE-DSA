package Sorting;

public class MergeSort {
    public void mergeSort(int[] arr, int left, int right) {
        if (left >= right)
            return;
        int mid = left + (right - left) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        int[] L = new int[mid - left + 1];
        int[] R = new int[right - mid];
        for (int i = 0; i < L.length; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < R.length; j++) {
            R[j] = arr[mid + 1 + j];
        }
        int i = 0, j = 0, k = left;

        while (i < L.length && j < R.length) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < L.length) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < R.length) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        MergeSort obj = new MergeSort();
        int[] arr = { 5, 2, 9, 1, 5, 6 };
        obj.mergeSort(arr, 0, arr.length - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
