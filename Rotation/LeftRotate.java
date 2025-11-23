package Rotation;

public class LeftRotate {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int n = arr.length;

        int temp = arr[0];

        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp;

        System.out.println("After left rotation: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
