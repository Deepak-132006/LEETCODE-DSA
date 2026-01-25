package Recursion;

public class CheckSorted {
    public boolean isSorted(int[] arr, int index){
        if(index == arr.length - 1) return true;

        if(arr[index] > arr[index + 1]) return false;

        return isSorted(arr, index + 1);
    }
    public static void main(String[] args) {
        CheckSorted obj = new CheckSorted();
        int[] arr = {1, 2, 3, 4, 1, 6};
        System.out.println(obj.isSorted(arr, 0));
        
    }
}
