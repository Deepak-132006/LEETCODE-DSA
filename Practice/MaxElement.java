package Practice;

public class MaxElement {
public static int maximum = 0;
    public static int max(int[] arr, int index) {
      
        if(index == arr.length - 1) return arr[index];        
        int small = max(arr, index + 1);
        return Math.max(arr[index], small);
    }
    public static void main(String[] args) {
        int[] arr = {4, 7, 1, 9, 2};
        System.out.println(new MaxElement().max(arr, 0));
        
    }
}
