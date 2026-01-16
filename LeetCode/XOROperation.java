package LeetCode;

public class XOROperation {
    public int xorOperation(int n, int start) {
        int xor = 0;
        for (int i = 0; i < n; i++) {
            xor ^= start + 2*i;
        }
        return xor;     
    }
    public static void main(String[] args) {
        XOROperation obj = new XOROperation();
        int n = 5;
        int start = 0;
        System.out.println(obj.xorOperation(n, start));
    }
}
