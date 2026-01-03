package LeetCode;

public class MostWater {
    public int maxArea(int[] height) {

        int right = height.length - 1;
        int left = 0;
        int maxArea = 0;

        while (left < right) {
            
            int width = right - left;
            int h = Math.min(height[right], height[left]);
            int area = width * h;

            if (area > maxArea) {
                maxArea = area;
            }
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        MostWater obj = new MostWater();
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

        System.out.println(obj.maxArea(height));
    }
}
