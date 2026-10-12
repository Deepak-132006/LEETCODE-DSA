package Practice;

public class BoundaryRot {
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        // 1. Top row: left to right
        for (int j = 0; j < cols; j++) {
            System.out.print(matrix[0][j] + " ");
        }

        // 2. Right column: top to bottom
        for (int i = 1; i < rows; i++) {
            System.out.print(matrix[i][cols - 1] + " ");
        }

        // 3. Bottom row: right to left
        if (rows > 1) {
            for (int j = cols - 2; j >= 0; j--) {
                System.out.print(matrix[rows - 1][j] + " ");
            }
        }

        // 4. Left column: bottom to top
        if (cols > 1) {
            for (int i = rows - 2; i > 0; i--) {
                System.out.print(matrix[i][0] + " ");
            }
        }
    }
}