package LeetCode;

public class FindPivotIndex {

    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int n = nums.length;
        int sum = 0;
        int totalSum = 0;
        int leftSum = 0;

        for(int i = 0; i < n; i++){
           sum =  sum + nums[i];
           totalSum = sum;
        }

        System.out.println("Total sum: "+totalSum);
        

        for(int i = 0; i < n; i++){
            int rightSum = totalSum - leftSum - nums[i];

            if(leftSum == rightSum){
                System.out.print("Pivot Index: "+ i);
                break;
            }
            leftSum+=nums[i];
        }
    }
}