package LeetCode;

public class IndexOfFirstOccur {
    public int strStr(String haystack, String needle) {
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j = 0;
            while (j < needle.length() && needle.charAt(j) == haystack.charAt( i + j)) {
                j++;
            }
            if(j == needle.length()){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String hayString = "sadbutsad";
        String needle = "sad";
        System.out.println(new IndexOfFirstOccur().strStr(hayString, needle));
    }
}