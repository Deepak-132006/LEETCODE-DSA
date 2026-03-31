package Practice;

public class GetFibo {
    public int getFibo(int n){
        if(n <= 1){
            return n;
        }
        return getFibo(n - 2) + getFibo(n - 1);
    }
    public static void main(String[] args) {
        int n = 5;
        GetFibo obj = new GetFibo();
        for (int i = 0; i <= n; i++) {
            System.out.println(obj.getFibo(i));
        }
    }
}
