package LeetCode;

public class GetSubStringBudget {
    public int equalSubstring(String s, String t, int maxCost) {
        int start = 0, end = 0, totalCost = 0, maxLength = 0;
        int[] costList = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            int cost = Math.abs(s.charAt(i) - t.charAt(i));
            costList[i] = cost;
        }

        while (end < s.length()) {
            totalCost += costList[end];
            while(totalCost > maxCost){
                totalCost -= costList[start];
                start++;
            }
            maxLength = Math.max(maxLength, end - start + 1);
            end++;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcd";
        String t = "cdef";
        int maxCost = 3;
        System.out.println(new GetSubStringBudget().equalSubstring(s, t, maxCost));
    }
}

// Input: s = "abcd", t = "bcdf", maxCost = 3
// Output: 3