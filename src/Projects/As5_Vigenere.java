package Projects;
import java.util.Scanner;

public class As5_Vigenere {

    public static void run() {
        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
                'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[][] vigenere = createVSquare(alphabet);
        printSquare(vigenere);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the decryption keyword (in CAPITAL letters): ");
        String keyword = scanner.nextLine().toUpperCase();

        System.out.println("Enter the encrypted message (in CAPITAL letters): ");
        String encryptedMessage = scanner.nextLine().toUpperCase();

        String decryptedMessage = "";
        int keyIndex = 0;

        for (int i = 0; i < encryptedMessage.length(); i++) {
            char cipherChar = encryptedMessage.charAt(i);
            char keyChar = keyword.charAt(keyIndex);

            int rowIndex = linearSearch(alphabet, keyChar);
            int colIndex = linearSearch(vigenere[rowIndex], cipherChar);

            if (colIndex != -1) {
                decryptedMessage += alphabet[colIndex];
            } else {
                decryptedMessage += cipherChar;
            }

            keyIndex++;
            if (keyIndex == keyword.length()) {
                keyIndex = 0;
            }
        }

        System.out.println("Decrypted message: " + decryptedMessage);
    }

    private static char[][] createVSquare(char[] alphabet) {
        char[][] square = new char[alphabet.length][alphabet.length];

        for (int i = 0; i < alphabet.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                int index = i + j;
                if (index >= alphabet.length) {
                    index -= alphabet.length;
                }
                square[i][j] = alphabet[index];
            }
        }

        return square;
    }

    public static void printSquare(char[][] square) {
        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
                'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        String yellow = "\u001B[33m";
        String reset = "\u001B[0m";

        System.out.print("   ");
        for (int col = 0; col < alphabet.length; col++) {
            System.out.print(yellow + alphabet[col] + " " + reset);
        }
        System.out.println();

        for (int row = 0; row < square.length; row++) {
            System.out.print(yellow + alphabet[row] + " " + reset);
            for (int col = 0; col < square[row].length; col++) {
                System.out.print(square[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static char getChar(char[][] arr, int row, int col) {
        return arr[row][col];
    }

    public static int linearSearch(char[] arr, char searchTerm) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchTerm) {
                return i;
            }
        }
        return -1;
    }


}