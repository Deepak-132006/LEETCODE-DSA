package LeetCode;

public class GrumpyOwner {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int start = 0;
        int alreadySatisfied = 0;
        int maxExtraSatisfied = 0;
        int customerSize = 0;
        int maxCustomer = 0;
        int left = 0;
        int right = 0;
        boolean power = true;

        for (int end = 0; end < customers.length; end++) {
            if (grumpy[end] == 0) {
                alreadySatisfied += customers[end];
            } else {

                customerSize += customers[end];
            }

            if (end - start + 1 == minutes && power) {
                if (customerSize > maxCustomer) {
                    maxCustomer = customerSize;
                    left = start;
                    right = end;
                }
                if (grumpy[start] == 1) {
                    customerSize -= customers[start];
                }
                start++;
            }
        }
        for (int i = left; i <= right; i++) {
            if (grumpy[i] == 1) {
                maxExtraSatisfied += customers[i];
            }
            power = false;
        }
        return alreadySatisfied + maxExtraSatisfied;
    }

    public static void main(String[] args) {

        int[] customers = { 1, 0, 1, 2, 1, 1, 7, 5 };
        int[] grumpy = { 0, 1, 0, 1, 0, 1, 0, 1 };
        int minutes = 3;
        System.out.println(new GrumpyOwner().maxSatisfied(customers, grumpy, minutes));

    }
}
