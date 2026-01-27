package Recursion;

public class SumOfDigits {
    public int sumDigits(int n) {
        if(n == 0) return 0;
        return (n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        SumOfDigits obj = new SumOfDigits();
        int n = 123456789;
        System.out.println(obj.sumDigits(n));
    }
}
