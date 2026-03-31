package Practice;

public class SumOfN {
    public static int sum(int n){
        int sum = 0;
        for(int i = 0; i <= n; i++){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(new SumOfN().sum(5));
    }
}
