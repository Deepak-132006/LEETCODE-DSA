package Recursion;

public class ReverseString {
    public void reverse(String str, int index){
        if(index == str.length()) return;
        
        reverse(str, index + 1);

        System.out.print(str.charAt(index));
    }
    public static void main(String[] args) {
        ReverseString obj = new ReverseString();
        String str = "deepak";
        obj.reverse(str, 0);
    }
}
