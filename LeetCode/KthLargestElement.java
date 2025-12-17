package LeetCode;

import java.util.PriorityQueue;

public class KthLargestElement {
    public int findKthLargest (int[] nums, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int num : nums){
            pq.add(num);
            if(pq.size() > k){
                pq.poll();
            }
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        KthLargestElement obj = new KthLargestElement();
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        System.out.print("Kth Largest Element: " + obj.findKthLargest(nums, k));
    }
}
