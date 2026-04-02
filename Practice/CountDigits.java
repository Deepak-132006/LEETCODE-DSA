package Practice;

public class CountDigits {
    static int count = 0;
    static int digit = 0;

    public static int countDigits(int n) {
        if (n == 0)
            return count;
        
        n = n / 10;
        count++;
        countDigits(n);
        return count;
    }

    public static void main(String[] args) {
        int n = 12345;
        System.out.println(new CountDigits().countDigits(n));

    }
}
