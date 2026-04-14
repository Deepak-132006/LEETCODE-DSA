package Recursion;

public class StringSubset {
    public static void stringSubsets(String str, StringBuilder path, int start) {
        System.out.println("\""+path.toString() + "\"");
        for (int i = start; i < str.length(); i++) {

            path.append(str.charAt(i));

            stringSubsets(str, path, i + 1);

            path.deleteCharAt(path.length() - 1);
            
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        stringSubsets("abc", new StringBuilder(), 0);
    }
}
