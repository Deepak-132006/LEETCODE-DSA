package Recursion;

public class FactorialOfN {
    public int fact(int n){
        if(n == 0 || n == 1) return 1;
        return n * fact( n - 1);
    }
    public static void main(String[] args) {
        FactorialOfN obj = new FactorialOfN();
        int n = 6;
        System.out.println(obj.fact(n));
    }
}
