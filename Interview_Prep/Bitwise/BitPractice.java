package Interview_Prep.Bitwise;

public class BitPractice {
    public static void main(String[] args) {
        int a = 12;
        int b = 10;
        int[] c = {2, 2, 1};

        int and = a & b;
        int or = a | b;
        int xor = a ^ b;

        int result = 0;
        for(int num : c) {
            result ^= num;
        }

        System.out.println(and);
        System.out.println(or);
        System.out.println(xor);
        System.out.println(result);
    }
}
