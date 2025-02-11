package Projects;

public class As5_Vigenere {
    public static void run() {
        char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K',
                'L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char[][] vigenere = createVSquare(alphabet);
        printSquare(vigenere);

    }

    private static char[][] createVSquare(char[] alphabet) {
        char[][] square = new char[alphabet.length][alphabet.length];


        for (int i = 0; i < alphabet.length; i++) {
            System.out.print(alphabet[i]);
        }

        System.out.println();
        for (int i = 0; i < alphabet.length; i++) {
            System.out.println(alphabet[i]);
        }


        return square;

    }//createVSquare

    public static void printSquare(char[][] square) {

    }//end printSquare

    public static int linearSearch (char[] arr, char searchTerm){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == searchTerm){
                return i;
            }
        }
        return -1;
    }

}//end class


