package Practice;

import java.util.HashMap;

public class CountFreq {
    public static void main(String[] args) {
        int arr[] = {1, 1, 3, 4, 4, 3, 2, 1, 2};

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println(map);
    }
}
