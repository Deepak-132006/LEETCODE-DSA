package LeetCode;

import java.util.Stack;

public class BaseballGame {
        public int calPoints(String[] operations) {
        Stack<Integer> score = new Stack<>();
        for(int i = 0; i < operations.length; i++){
            if(operations[i].equals("+")){
                int sum = score.get(score.size() - 1) + score.get(score.size() - 2);
                score.push(sum);
            } else if (operations[i].equals("D") ){
                int dble = score.peek() * 2;
                score.push(dble);
            } else if(operations[i].equals("C")){
                score.pop();
            } else {
                score.push(Integer.parseInt(operations[i]));
            }
        }

        int sum = 0;
        while(!score.empty()){
            sum += score.pop();
        }
        return sum;
    }
    public static void main(String[] args) {
        String[] operations = {"5","2","C","D","+"};
        System.out.println(new BaseballGame().calPoints(operations));
    }    
}
