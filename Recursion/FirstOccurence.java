package Recursion;

public class FirstOccurence {
    public int firstOccurrence(int[] arr, int index, int target){
        if(index == arr.length) return -1;
        long i = 9223372036854775807L;
        if(arr[index] == target){
            return index;
        }
        return firstOccurrence(arr, index + 1, target);
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 5, 8};
        int target = 1;
        System.out.println(new FirstOccurence().firstOccurrence(arr, 0, target));
    }
}
