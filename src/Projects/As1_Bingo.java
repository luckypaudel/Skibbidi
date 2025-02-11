package Projects;

public class As1_Bingo {
    public static void run() {
        String[] Bingo = {"B", "I", "N", "G", "O"};
        int[][] scoreCard = new int[5][5];
        scoreCard[0] = genArray(5, 1, 15);
        scoreCard[1] = genArray(5, 16, 30);
        scoreCard[2] = genArray(5, 31, 45);
        scoreCard[3] = genArray(5, 46, 60);
        scoreCard[4] = genArray(5, 61, 75);
        for (int i = 0; i < Bingo.length; i++) {
            System.out.print(" " + Bingo[i] + " ");


        }
        System.out.println();
        print2DString(scoreCard);

        while (true) {

Library.input.nextLine();
            int number = Library.myRandom(1, 70);
            System.out.println("The number " + number +  " was called " );
            for (int i = 0; i < Bingo.length; i++) {
                for (int j = 0; j < scoreCard.length; j++) {
                    if (number == scoreCard[i][j]) {
                        scoreCard[i][j] =  scoreCard[i][j] * -1;
                        System.out.println("It was on your card!");
                        print2DString(scoreCard);

                    }
//                    if(scoreCard)

                }
            }


        }//a
    }


        public static int[] genArray ( int arrayLength, int max, int min){
            int[] values = new int[arrayLength];


            for (int i = 0; i < arrayLength; i++) {
                values[i] = Library.myRandom(min, max);


            }
            return values;


        }


        public static void print2DString ( int[][] arr){
            for (int r = 0; r < arr.length; r++) {
                for (int c = 0; c < arr[r].length; c++) {

                    System.out.print(" " + arr[r][c]);
                }
                System.out.println(" ");
            }


        }


    }


