package Recursion;

public class CountZeros {
    public static int countZeros(int n, int count){
        if(n == 0 ) return count;
        int digit = n % 10;
        n = n / 10;
        if(digit == 0){
            count++;
        }
        return countZeros(n, count);
    }
    public static void main(String[] args) {
        int n = 1020300;
        System.out.println(countZeros(n, 0));
    }
}
