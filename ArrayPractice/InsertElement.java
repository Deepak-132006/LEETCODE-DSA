package ArrayPractice;
public class InsertElement {
    public static void main(String[] args) {
        int[] arr = new int[7];
        int n = 5;
        int insertValue1 = 5;
        int insertValue2 = 60;
        int insertIndex1 = 0;

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        for (int i = n - 1; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[insertIndex1] = insertValue1;
        n++;

        arr[n] = insertValue2;
        n++;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
