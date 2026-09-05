package Interview_Prep;

import java.util.HashMap;
import java.util.Map;

public class VoteWinner {
    public char winner(String voteList) {
        HashMap <Character, Integer> map = new HashMap<>();
        char winner = ' '; 
        int max = 0;
        for(char voter : voteList.toCharArray()) {
            map.put(voter, map.getOrDefault(voter, 0) + 1);
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() > max) {
                max = entry.getValue();
                winner = entry.getKey();
            }
        }
        return winner;
    }

    public static void main(String[] args) {
        String voteList = "XXYYZZZXZXX";
        System.out.println(new VoteWinner().winner(voteList));
    }
}
