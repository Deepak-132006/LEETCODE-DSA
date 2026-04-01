package Practice;

public class PrintArray {
    public static void printArray(int[] arr, int index) {
        if (index > arr.length - 1) {
            return;
        } else {
            System.out.println(arr[index]);
            printArray(arr, index + 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        new PrintArray().printArray(arr, 0);
    }
}