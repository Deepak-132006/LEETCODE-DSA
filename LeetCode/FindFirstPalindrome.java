package LeetCode;

public class FindFirstPalindrome {
    public String firstPalindrome(String[] words){
        for(int i = 0; i < words.length; i++){
            int left = 0, right = words[i].length() - 1;
            boolean isPalin = true;
            while(words[i].charAt(left) != words[i].charAt(right)){
                isPalin = false;
                break;
            }
            left++;
            right--;
            
            if(isPalin){
                return words[i];
            }
        }
        return "";
    }
    public static void main(String[] args) {
        String[] words = { "abc", "car", "ada", "racecar", "cool" };
        System.out.println(new FindFirstPalindrome().firstPalindrome(words));
    }
}