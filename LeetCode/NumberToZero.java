package LeetCode;

public class NumberToZero {
    public int numberOfSteps(int num) {
        int steps = 0;
        while(num > 0){
            steps++;
            if(num % 2 != 0){
                num = num - 1;
            }
            else{
                num = num / 2;
            }
        }
        return steps;
    }

    public static void main(String[] args) {
        NumberToZero obj = new NumberToZero();
        int num = 14;
        System.out.println(obj.numberOfSteps(num));
    }
}
