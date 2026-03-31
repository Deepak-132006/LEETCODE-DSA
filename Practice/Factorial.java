package Practice;

public class Factorial {
    public static int factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative not Allowed");
        if(n == 1 || n == 0) return 1;
        return n * factorial( n - 1);
    }

    public static void main(String[] args) {
        System.out.println(new Factorial().factorial(5));
    }
}
