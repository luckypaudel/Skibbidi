package Projects;

import java.util.Random;

public class As1_Bingo {
    public static void run() {
        String[] Bingo = {"B", "I", "N", "G", "O"};
        int[][] scoreCard = new int[5][5];
        Random rand = new Random();

        for (int i = 0; i < 5; i++) {
            scoreCard[i] = genArray(5, 1 + i * 15, 15 + i * 15);
        }

        for (String letter : Bingo) {
            System.out.print(" " + letter + " ");
        }
        System.out.println();
        print2DString(scoreCard);

        while (true) {
            Library.input.nextLine();
            int number = Library.myRandom(1, 75);
            System.out.println("The number " + number + " was called");

            for (int r = 0; r < 5; r++) {
                for (int c = 0; c < 5; c++) {
                    if (scoreCard[r][c] == number) {
                        scoreCard[r][c] *= -1;
                        System.out.println("It was on your card!");
                        print2DString(scoreCard);

                        if (checkWin(scoreCard)) {
                            System.out.println("BINGO! You won!");
                            return;
                        }
                    }
                }
            }
        }
    }

    public static int[] genArray(int arrayLength, int min, int max) {
        int[] values = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            values[i] = Library.myRandom(min, max);
        }
        return values;
    }

    public static void print2DString(int[][] arr) {
        for (int[] row : arr) {
            for (int num : row) {
                System.out.printf("%4d ", num);
            }
            System.out.println();
        }
    }

    public static boolean checkWin(int[][] board) {
        for (int i = 0; i < 5; i++) {
            // Check rows
            boolean rowComplete = true;
            for (int c = 0; c < 5; c++) {
                if (board[i][c] > 0) {
                    rowComplete = false;
                    break;
                }
            }
            if (rowComplete) return true;

            // Check columns
            boolean colComplete = true;
            for (int r = 0; r < 5; r++) {
                if (board[r][i] > 0) {
                    colComplete = false;
                    break;
                }
            }
            if (colComplete) return true;
        }
        return false;
    }
}
