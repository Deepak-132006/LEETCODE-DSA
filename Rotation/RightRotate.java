package Rotation;

public class RightRotate {
    public static void main (String [] args){
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int temp = arr [n - 1];

        System.out.print("Before Right Rotation: ");
        for ( int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        for(int i = n - 2; i >= 0; i--){
            arr[i + 1] = arr[i];
        }

        arr[0] = temp;
        System.out.println("\n");
        System.out.print("After Right Rotation: ");
        for( int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

    }

}
