package Recursion;

public class SumOfFirstN {
    public int sum(int n){
        if( n == 1) return 1;
        return n + sum(n - 1);
    }
    public static void main(String[] args) {
        SumOfFirstN obj = new SumOfFirstN();
        int n = 5;
        System.out.println(obj.sum(n));
    }
}