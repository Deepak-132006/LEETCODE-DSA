package LeetCode;

public class HighestAltitude {
    public int largestAltitude(int[] gain) {
        int points = 0;
        int maxPoints = 0;

        for (int i = 0; i < gain.length; i++) {
            points += gain[i];
            maxPoints = Math.max(maxPoints, points);
        }
        return maxPoints;
    }

    public static void main(String[] args) {
        int[] gain = { -4, -3, -2, -1, 4, 3, 2 };
        System.out.println(new HighestAltitude().largestAltitude(gain));
    }

}
