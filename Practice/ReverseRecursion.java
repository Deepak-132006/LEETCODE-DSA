package Practice;

import java.util.Arrays;

public class ReverseRecursion {
    public static void reverse(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        reverse(arr, left++, right--);
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        new ReverseRecursion().reverse(arr , 0, arr.length - 1);
    }
}
