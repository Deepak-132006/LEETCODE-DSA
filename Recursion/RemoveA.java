package Recursion;

public class RemoveA {
    public static int index;

    public static String remove(String str) {
        if(str.length() == 0){
            return "";
        }
        char ch = str.charAt(0);
        if(ch == 'a'){
            return remove(str.substring(1));
        }
        return ch + remove(str.substring(1));
    }

    public static void main(String[] args) {
        String str = "banana";
        System.out.println(new RemoveA().remove(str));
    }
}
