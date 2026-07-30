package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    private int digitExtract(int n) {
        int output = 0;
        while (n > 0) {
            int digit = n % 10;
            output += digit * digit;
            n /= 10;
        }
        return output;
    }

    public boolean isHappy(int n) {
        Set<Integer> visit = new HashSet<>();
        while(!visit.contains(n)){
            visit.add(n);
            System.out.println(visit);
            n = digitExtract(n);
            if(n == 1){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 19;
        System.out.println(new HappyNumber().isHappy(n));
    }
}