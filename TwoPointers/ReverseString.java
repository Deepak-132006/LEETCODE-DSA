package TwoPointers;

public class ReverseString {
    public char[] reverse(char[] s){
        int left = 0, right = s.length - 1;
        while (left < right ){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        return s;
    }
    public static void main(String[] args) {
        ReverseString obj = new ReverseString();
        char[] s = {'8', '1', '2', '6'};
        char[] result = obj.reverse(s);
        System.out.print(result);
    }
}
