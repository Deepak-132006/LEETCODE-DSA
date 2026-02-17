package LeetCode;

public class MaxWords {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(String sentence : sentences){
            String[] word = sentence.split(" ");
            max = Math.max(max, word.length);
        }
        return max;
    }
    public static void main(String[] args) {
        String[] sentences = {"please wait", "continue to fight", "continue to win"};
        MaxWords obj = new MaxWords();
        System.out.println(obj.mostWordsFound(sentences));
    }
}