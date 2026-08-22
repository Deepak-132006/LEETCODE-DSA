package Practice;

public class LongestCommonSubsequence {
    public String lcs(String s1, String s2) {
        int a = s1.length();
        int b = s2.length();
        int[][] dp = new int[a + 1][b + 1];

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        StringBuilder result = new StringBuilder();

        int j = b;
        int i = a;

        while (i > 0 && j > 0) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                result.append(s1.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[j][i - 1]) {
                i--;
            } else {
                j--;
            }
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String s1 = "ABCBDAB";
        String s2 = "BDCABA";
        System.out.println(new LongestCommonSubsequence().lcs(s1, s2));
    }
}
