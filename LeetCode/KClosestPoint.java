package LeetCode;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KClosestPoint {
    public static int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> (b[0] * b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1] * a[1]));

        for (int[] point : points) {
            pq.add(point);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[][] result = new int[k][2];
        for (int i = 0; i < k; i++) {
            result[i] = pq.poll();
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] points = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
        int k = 2;
        int[][] res = kClosest(points, k);

        System.out.println("K Closest Points to the origin: ");
        for (int[] p : res) {
            System.out.print(Arrays.toString(p));
        }
    }
}
