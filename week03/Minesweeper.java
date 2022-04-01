/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);
        int[][] minesArray = new int[m + 2][n + 2];
        int[][] countMinesArray = new int[m][n];

        int count = 0;
        while (count != k) {
            int randomX = (int) (m * Math.random());
            int randomY = (int) (n * Math.random());
            if (minesArray[randomX + 1][randomY + 1] != 1) {
                minesArray[randomX + 1][randomY + 1] = 1;
                count++;
            }
        }

        // PRINT minesArray
        // for (int i = 0; i < m + 2; i++) {
        //     for (int j = 0; j < n + 2; j++) {
        //         System.out.print(minesArray[i][j]);
        //     }
        //     System.out.println();
        // }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (minesArray[i + 1][j + 1] != 1) {
                    countMinesArray[i][j] = minesArray[i][j] + minesArray[i][j + 1] + minesArray[i][
                            j + 2] + minesArray[i + 1][j] +
                            minesArray[i + 1][j + 2] + minesArray[i + 2][j] + minesArray[i + 2][j
                            + 1]
                            + minesArray[i + 2][j + 2];
                }
                else {
                    countMinesArray[i][j] = 1;
                }
            }
        }

        // PRINT countMinesArray
        // for (int i = 0; i < m; i++) {
        //     for (int j = 0; j < n; j++) {
        //         System.out.print(countMinesArray[i][j]);
        //     }
        //     System.out.println();
        // }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (minesArray[i + 1][j + 1] == 1) {
                    System.out.print("*  ");
                }
                else {
                    System.out.print(countMinesArray[i][j] + "  ");
                }
            }
            System.out.println();
        }
    }
}
