package LeetCode;

public class CapacityToShip {
    public boolean canShip(int[] weights, int days, int capacity) {
        System.out.println("Capacity: " + capacity);
        int currentWeight = 0;
        int daysNeeded = 1;
        for (int weight : weights) {
            if (currentWeight + weight > capacity) {
                daysNeeded++;
                currentWeight = weight;
            } else {
                currentWeight += weight;
            }
        }
        System.out.println(days >= daysNeeded);
        return days >= daysNeeded;
    }

    public int shipWithinDays(int[] weights, int days) {
        int left = 0, right = 0;
        for (int weight : weights) {
            left = Math.max(left, weight);
            right += weight;
        }
        while (left <= right) {
            int mid = left + (right - left) / 2;
            System.out.println("Left: " + left + "\nRight: " + right);
            System.out.println("Mid: " + mid);

            if (canShip(weights, days, mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] weights = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int days = 5;
        System.out.println(new CapacityToShip().shipWithinDays(weights, days));
    }
}
