package Recursion;

public class LastOccurence {
    public int lastOccurence(int[] arr, int index, int target){
        if(index < 0) return -1;
        if(arr[index] == target){
            return index;
        }
        return lastOccurence(arr, index - 1, target);

    } 
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 1, 4, 5, 3};
        int target = 1;
        System.out.println(new LastOccurence().lastOccurence(arr, arr.length - 1, target));
    }
}
