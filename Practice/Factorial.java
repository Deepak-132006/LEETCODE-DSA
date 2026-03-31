package Practice;

public class Factorial {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact *= i;            
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println(new Factorial().factorial(5));
    }
}
