package Rotation;

public class LeftRotateK {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int n = arr.length;
        int k = 2;
        k = k % n;

        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }
        for (int i = 0; i < k; i++) {
            arr[n - k + i] = temp[i];
        }
        System.out.print("After left rotation by " + k + ": ");
        for (int x : arr) {
            System.out.print(x + " ");
        }

    }

}
