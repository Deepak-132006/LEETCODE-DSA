package LeetCode;

public class LongestRepeating {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        int maxLen = 0;
        int[] freq = new int[26];
        int maxFreq = 0;
        while (right < s.length()) {
            char ch = s.charAt(right);
            freq[ch - 'A']++;
            maxFreq = Math.max(maxFreq, freq[ch - 'A']);
            while ((right - left + 1) - maxFreq > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            int windowSize = right - left + 1;
            maxLen = Math.max(maxLen, windowSize);
            right++;

        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        LongestRepeating obj = new LongestRepeating();
        System.out.println(obj.characterReplacement(s, k));
    }
}
