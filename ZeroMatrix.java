// Zero Matrix: Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to O.


public class ZeroMatrix {

    public void modifyMatrix(int mat[][], int R, int C) {
        int row[] = new int[R];
        int col[] = new int[C];
        int i, j;

        /* Initialize all values of row[] as 1 */
        for (i = 0; i < R; i++) {
            row[i] = 1;
        }


        /* Initialize all values of col[] as 1 */
        for (i = 0; i < C; i++) {
            col[i] = 1;
        }


        for (i = 0; i < R; i++) {
            for (j = 0; j < C; j++) {
                if (mat[i][j] == 0) {
                    row[i] = 0;
                    col[j] = 0;
                }
            }
        }


        for (i = 0; i < R; i++) {
            for (j = 0; j < C; j++) {
                if (row[i] == 0 || col[j] == 0) {
                    mat[i][j] = 0;
                }
            }
        }
    }

    /* A utility function to print a 2D matrix */
    public void printMatrix(int mat[][], int R, int C) {
        int i, j;
        for (i = 0; i < R; i++) {
            for (j = 0; j < C; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
