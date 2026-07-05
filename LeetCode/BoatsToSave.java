package LeetCode;

import java.util.Arrays;

public class BoatsToSave {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;
        int boat = 0;

        while (left <= right){
            if(people[right] == limit){
                boat++;
                right--;
            } else if (people[left] + people[right] <= limit){
                boat++;
                left++;
                right--;
            } else {
                boat++;
                right--;
            }
        }
        return boat;
    }

    public static void main(String[] args) {
        int[] people = { 3, 2, 2, 1 };
        int limit = 3;
        System.out.println(new BoatsToSave().numRescueBoats(people, limit));

    }
    // Input: people = [1,2], limit = 3
    // Output: 1
    // Input: people = [3,2,2,1], limit = 3
    // Output: 3
    // Input: people = [3,5,3,4], limit = 5
    // Output: 4
}
