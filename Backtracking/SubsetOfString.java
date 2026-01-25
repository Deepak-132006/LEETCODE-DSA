package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class SubsetOfString {
    public void subset(String str, int index, String current, List<String> result){
        if(index == str.length()){
            result.add(current);
            return;
        }

        subset(str, index + 1, current + str.charAt(index), result);

        subset(str, index + 1, current, result);
    }
    public static void main(String[] args) {
        SubsetOfString obj = new SubsetOfString();
        String s = "abc";
        List<String> result = new ArrayList<>();
        obj.subset(s, 0, "", result);
        System.out.println(result);
    }
}
