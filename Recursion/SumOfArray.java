package Recursion;

public class SumOfArray {
    public int findSum(int[] arr, int index){
        if(index == arr.length - 1) return arr[index];
        return arr[index] + findSum(arr, index + 1);
    }
    public static void main(String[] args) {
        SumOfArray obj = new SumOfArray()        ;
        int[] arr = {2, 4, 6, 8, 10};
        System.out.println(obj.findSum(arr, 0));
    }
}
