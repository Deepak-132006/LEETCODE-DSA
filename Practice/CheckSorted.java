package Practice;

public class CheckSorted {
    public static boolean isSorted(int[] arr, int index) {
        if(index == arr.length - 1) return true;
        if(arr[index + 1] < arr[index]){
            return false;
        } 
        return isSorted(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9};
        System.out.println(new CheckSorted().isSorted(arr, 0));
    }
}
