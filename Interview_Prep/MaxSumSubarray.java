package Interview_Prep;

public class MaxSumSubarray {
    public int maxSumSubarray(int[] arr) {

        int ans = 1;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int currentSum = +arr[i];
            sum = Math.max(sum, currentSum);
            
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = { 1, -2, 0, 3 };
        System.out.println(new MaxSumSubarray().maxSumSubarray(arr));
    }
}
