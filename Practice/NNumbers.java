package Practice;

public class NNumbers {
    public static void printNumbers(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        new NNumbers().printNumbers(7);
    }
}