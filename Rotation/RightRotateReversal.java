package Rotation;

public class RightRotateReversal {
    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

public static void main(String [] args){
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
    int n = arr.length;
    int k = 3;
    reverse(arr, 0, n - 1 );

    reverse(arr, 0, k - 1);

    reverse(arr, k, n - 1);

    System.out.print("After right rotation by reversal algo: ");
    for(int i = 0; i < n; i++){
        System.out.print(arr[i] + " ");
    }

}
}
