package LeetCode;

public class CountOfMatches {
    public int numberOfMatches(int n) {
        int matches = 0;
        while (n > 1) {
            matches += n / 2;
            n = n / 2 + n % 2;
        }
        return matches;
    }
    public static void main(String[] args) {
        CountOfMatches obj = new CountOfMatches();
        int n = 7;
        System.out.println(obj.numberOfMatches(n));
    }
}
