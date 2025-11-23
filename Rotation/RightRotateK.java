package Rotation;

public class RightRotateK {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        int k = 2;
        k = k % n;

        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[n - k + i];
        }

        for(int i = n - k - 1; i >= 0; i--){
            arr[i + k] = arr[i];
        }

        for(int i = 0; i < k; i++){
            arr[i] = temp [i];
        }

        System.out.println("After Right rotation by " + k + ": ");
        for(int x:arr){
            System.out.print(x + " ");
        }
    }
}