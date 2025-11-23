public class RemoveByValue {
    public static void main(String[] args) {
        int[] arr = { 17, 81, 21, 10, 9 };
        int removeIndex = -1;
        int n = arr.length;
        int removeValue = 21;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == removeValue) {
                removeIndex = i;
                break;
            }
        }
        if (removeIndex == -1) {
            System.out.println("Value not found");
        } else {
            for (int i = removeIndex; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--;

            System.out.println("After removal: ");
            for (int i = 0; i < n; i++) {
                System.out.println(arr[i] + " ");
            }

        }

    }
}
