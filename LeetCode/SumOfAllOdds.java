package LeetCode;

public class SumOfAllOdds {
    public int sumOddLengthSubarrays(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for(int j = i; j < arr.length; j++){
                sum += arr[j];
                int length = j - i + 1;
                if(length % 2 != 0) {
                    total += sum;
                }
            }
        }
        return total;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 2, 5, 3 };
        System.out.println(new SumOfAllOdds().sumOddLengthSubarrays(arr));
    }
}
