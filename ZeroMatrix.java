import java.util.Arrays;

/**
 * Zerofie all columns and rows in matrix where 0 is found
 */

public class ZeroMatrix {

    public static void main(String[] args) {
        // init matrix
        int COLUMNS = 3;
        int ROWS = 3;
        int[][] matrix = new int[ROWS][COLUMNS];
        matrix[0][0] = 0;
        matrix[0][1] = 1;
        matrix[0][2] = 1;
        matrix[1][0] = 1;
        matrix[1][1] = 1;
        matrix[1][2] = 1;
        matrix[2][0] = 1;
        matrix[2][1] = 1;
        matrix[2][2] = 1;
        matrixPrn(matrix);
        // find columns and rows to zerofie
        boolean[] columns0 = new boolean[COLUMNS];
        boolean[] rows0 = new boolean[ROWS];
        for(int row = 0; row < ROWS; row++) {
            for(int col = 0; col < COLUMNS; col++) {
                if (matrix[row][col] == 0) {
                    columns0[col] = true;
                    rows0[row] = true;
                }
            }
        }
        // zerofie columns
        for (int idx = 0; idx < COLUMNS; idx++) {
            if (columns0[idx]) {
                for (int y = 0; y < ROWS; y++) {
                    matrix[y][idx] = 0;
                }
            }
        }
        // zerofie rows
        for (int idx = 0; idx < ROWS; idx++) {
            if (rows0[idx]) {
                for (int x = 0; x < COLUMNS; x++) {
                    matrix[idx][x] = 0;
                }
            }
        }
        // show result
        matrixPrn(matrix);
    }

    // Show matrix
    public static void matrixPrn(int[][] matrix) {
        for (int[] row : matrix)
            System.out.println(Arrays.toString(row));
        System.out.print("\n");
    }

}
