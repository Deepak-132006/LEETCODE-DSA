package LeetCode;

public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed[n - 1] == 1){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] flowerbed = { 1, 0, 0, 0, 1 };
        int n = 2;
        System.out.println(new CanPlaceFlowers().canPlaceFlowers(flowerbed, n));
    }
}
