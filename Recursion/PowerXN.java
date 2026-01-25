package Recursion;

public class PowerXN {
    public double power(double x, int n){
        
        if(n == 0) return 1;

        double half = power(x, n / 2);
        if (n % 2 == 0) {
            return half * half;            
        } else {
            return x * half * half;
        }
    }
    public static void main(String[] args) {
        PowerXN obj = new PowerXN();
        double x = 2;
        int n = 5;
        System.out.println(obj.power(x, n));
    }
}
