package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            if (i == 0) {
                for (int k = 0; k < matrix[i].length; k++) {

                    result.add(matrix[i][k]);
                }
            }

            if (i >= matrix.length - 2) {
                
                for (int j = matrix[i].length - 1; j >= 0; j--) {
                    result.add(matrix[i][matrix[j].length - 1]);
                }
            }
        }
        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result.add(matrix[i][j]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        SpiralMatrix obj = new SpiralMatrix();
        System.out.println(obj.spiralOrder(matrix));
        
    }
}
