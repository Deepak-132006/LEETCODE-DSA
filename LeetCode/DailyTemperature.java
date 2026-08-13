package LeetCode;

import java.util.Stack;

public class DailyTemperature {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] results = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < temperatures.length; i++){
            while(!stack.isEmpty() && stack.peek() > temperatures[i]){
                results[i] = - stack.pop();
            }
        }
        
        return ;
    }

    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        System.out.println(new DailyTemperature().dailyTemperatures(temperatures));
    }
}
