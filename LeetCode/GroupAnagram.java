package LeetCode;

// String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
import java.util.*;

public class GroupAnagram {
    public void groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();
        String[] words = new String[strs.length];
        for (int i = 0; i < strs.length; i++) {
            words[i] = strs[i];
        }
        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            System.out.println(sortedWord);

            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(word);
        }
        List<List<String>> result = new ArrayList<>(map.values());
        System.out.println(result);

    }

    public static void main(String[] args) {
        GroupAnagram obj = new GroupAnagram();
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
        obj.groupAnagrams(strs); 
    }
}
