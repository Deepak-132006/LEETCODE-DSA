package LeetCode;

public class MaxConfusionExam {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int start = 0, end = 0;
        int trueCount = 0, falseCount = 0;
        int max = 0;

        while(end < answerKey.length()){
            if(answerKey.charAt(end) == 'F'){
                falseCount++;
            } else {
                trueCount++;
            }
            while( falseCount > k && trueCount > k ){
                if(answerKey.charAt(start) == 'F') falseCount--;            
                if(answerKey.charAt(start) == 'T') trueCount--;
                start++;
            }
            int windowSize = end - start + 1;
            max = Math.max(max, windowSize);
            end++;
        }
        return max;
    }
    public static void main(String[] args) {
        String answerKey = "TTFTTFTT";
        int k = 1;
        System.out.println(new MaxConfusionExam().maxConsecutiveAnswers(answerKey, k));
    }
}


// Input: answerKey = "TTFF", k = 2
// Output: 4