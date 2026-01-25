package Recursion;

public class Fibonacci {
    public int fab(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;

        return fab(n - 2) + fab(n - 1);
    }
    public static void main(String[] args) {
        Fibonacci obj = new Fibonacci();
        int n = 6;
        System.out.println(obj.fab(n));
    }
}
