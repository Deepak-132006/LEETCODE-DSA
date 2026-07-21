package LeetCode;

public class GCDOfStrings {
    public String gcdOfStrings(String str1, String str2) {
        int n = str1.length() + str2.length() - 1;
        StringBuilder result = new StringBuilder();
        int start = 0, end = 0;
        
    }        
    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";
        System.out.println(new GCDOfStrings().gcdOfStrings(str1, str2));
    }
}
