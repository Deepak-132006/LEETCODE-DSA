package LeetCode;

import java.util.Arrays;

public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int index = 0;
        int happyChild = 0;
        while (index < g.length && index < s.length) {
            if (g[index] <= s[index]) {
                happyChild++;
            }
            index++;
        }
        return happyChild;
    }

    public static void main(String[] args) {
        int[] g = { 1, 2, 3 };
        int[] s = { 1, 1 };
        System.out.println(new AssignCookies().findContentChildren(g, s));
    }
}
