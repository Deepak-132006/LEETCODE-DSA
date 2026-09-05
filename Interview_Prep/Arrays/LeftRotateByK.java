package Interview_Prep.Arrays;

import java.util.Scanner;

public class LeftRotateByK {
    static void reverse(int[] nums, int start, int end) {

        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        k = k % size;

        reverse(arr, 0, k -1);
        reverse(arr, k, size - 1);
        reverse(arr, 0, size - 1);

        for(int num : arr) {

            System.out.print(num + " ");
        }
        sc.close();
    }
}
