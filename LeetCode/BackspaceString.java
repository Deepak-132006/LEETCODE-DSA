package LeetCode;

public class BackspaceString {
    public boolean backspaceCompare(String s, String t) {
        int indexS = s.length() - 1;
        int indexT = t.length() - 1;
        int backspaceS = 0;
        int backspaceT = 0;

        while (indexS >= 0 || indexT >= 0) {

            while (indexS >= 0) {
                if (s.charAt(indexS) == '#') {
                    backspaceS++;
                    indexS--;
                } else if (backspaceS > 0) {
                    backspaceS--;
                    indexS--;
                } else {
                    break;
                }
            }

            while (indexT >= 0) {
                if (t.charAt(indexT) == '#') {
                    backspaceT++;
                    indexT--;
                } else if (backspaceT > 0) {
                    backspaceT--;
                    indexT--;
                } else {
                    break;
                }
            }

            if (indexS >= 0 && indexT < 0) {
                return false;
            }

            if (indexS < 0 && indexT >= 0) {
                return false;
            }

            if (indexS >= 0 && indexT >= 0) {
                if (s.charAt(indexS) != t.charAt(indexT)) {
                    return false;
                }
            }

            indexS--;
            indexT--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ab#c";
        System.out.println(new BackspaceString().backspaceCompare(s, t));
    }
}
