package Practice;

public class PrintReverse {
    public static void printReverse(int n){
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        new PrintReverse().printReverse(10);
    }
}
