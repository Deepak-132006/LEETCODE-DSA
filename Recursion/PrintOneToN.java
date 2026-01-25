package Recursion;

public class PrintOneToN {
    public void print1toN(int n) {
        if (n == 0)
            return;

        print1toN(n - 1);
        System.out.println(n + " ");
    }

    public static void main(String[] args) {
        PrintOneToN obj = new PrintOneToN();
        int n = 5;
        obj.print1toN(n);
    }
}
