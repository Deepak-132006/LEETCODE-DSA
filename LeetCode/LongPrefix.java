package LeetCode;

public class LongPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        String wordByChar = strs[0];
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < wordByChar.length(); i++) {
            char currentChar = wordByChar.charAt(i);
            for(int j = 0; j < strs.length; j++){
                if (i >= strs[j].length() || strs[j].charAt(i) != currentChar) {
                    return result.toString();
                }
            }
            result.append(currentChar);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        LongPrefix obj = new LongPrefix();
        String[] strs = { "flower", "flow", "flight" };
        System.out.println(obj.longestCommonPrefix(strs));
    }
}