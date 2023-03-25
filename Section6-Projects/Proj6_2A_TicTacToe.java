import java.util.Scanner;

public class Proj6_2A_TicTacToe {
    public static void main(String[] args) {
        //Teacher solution
        runGame();
    }//end main

    public static void runGame() {
        String winner = "";
        boolean xTurn = true;
        String[][] gameBoard = new String[3][3];

        initializeGameBoard(gameBoard);

        //print initial board
        printCurrentBoard(gameBoard);

        //"" signals no winner
        while(winner.equals("")) {
            if (xTurn) {
                System.out.println("It's X's turn");
            }
            else {
                System.out.println("It's O's turn");
            }//end if-else

            getUserInput(xTurn, gameBoard);
            System.out.println();  //extra spacing

            printCurrentBoard(gameBoard);  //reprint board
            winner = getWinner(gameBoard);
            xTurn = !xTurn;  //flip value true or false

            if (winner.equals("") && isBoardFull(gameBoard)) {
                winner = "C";
            }//end if
        }//end while

        //cat's game?
        System.out.println();

        if (winner.equals("C")) {
            System.out.println("It was the Cat's game!  NO WINNER!");
        }
        else {
            System.out.println("The winner is " + winner);
        }//end if-else
    }//end runGame

    public static void initializeGameBoard(String[][] gameBoard) {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard.length; j++) {
                gameBoard[i][j] = " ";
            }//end for j
        }//end for i
    }//end initializeGameBoard

    public static void printCurrentBoard(String[][] gameBoard) {

        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard.length; j++) {
                if(j < 2) {
                    System.out.print(gameBoard[i][j] + " | ");
                } else {
                    System.out.println(gameBoard[i][j]);
                }//end if
            }
            if(i < 2) {
                System.out.println("- - - - -");
            }
        }
    }//end printCurrentBoard

    public static void getUserInput(boolean xTurn, String[][] gameBoard) {
        Scanner keyboard = new Scanner(System.in);

        int row = -1;
        int col = -1;
        boolean keepAsking = true;

        while(keepAsking) {
            System.out.println("Please enter the row and column, each from 0, 1, or 2, separated by a space");

            row = keyboard.nextInt();
            col = keyboard.nextInt();
            keyboard.nextLine(); //consume new line char

            if(row >= 0 && row <= 2 && col >= 0 && col <=2) {
                //valid and in-range selection
                //but, is it occupied by an X or O already?
                if(!cellAlreadyOccupied(row, col, gameBoard)) {
                    keepAsking = false;
                }
                else {
                    System.out.println("That cell is already occupied!");
                }//end if-else
            }//end if
        }//end while

        //by the time it gets here, we know it's a VALID row and column
        //in range, and not already occupied!

        if(xTurn) {
            gameBoard[row][col] = "X";
        }
        else {
            gameBoard[row][col] = "O";
        }
    }//end getUserInput

    public static boolean cellAlreadyOccupied(int row, int col, String[][] gameBoard) {
        return !gameBoard[row][col].equals(" ");
    }//end cellAlreadyOccupied

    public static String getWinner(String[][] gameBoard) {
        final int ROWS = gameBoard.length;
        final int COLS = gameBoard[0].length;
        //Row tests for Tic-Tac-Toe
        for (int i = 0; i < ROWS; i++) {
            if (!gameBoard[i][0].equals(" ") &&
                gameBoard[i][0].equals(gameBoard[i][1]) &&
                gameBoard[i][1].equals(gameBoard[i][2])) {
                    return gameBoard[i][0];  //we have a match (Row)
            }//end if
        }//end for
        //Column tests for Tic-Tac-Toe
        for (int i = 0; i < COLS; i++) {
            if (!gameBoard[0][i].equals(" ") &&
                gameBoard[0][i].equals(gameBoard[1][i]) &&
                gameBoard[1][i].equals(gameBoard[2][i])) {
                    return gameBoard[0][i];  //we have a match (Col)
            }//end if
        }// end for

        //upper left to lower right Diagonal test for Tic-Tac-Toe
        if(!gameBoard[0][0].equals(" ") &&
                gameBoard[0][0].equals(gameBoard[1][1]) &&
                gameBoard[1][1].equals(gameBoard[2][2])) {
            return gameBoard[0][0];  //diagonal match!
        }//end if
        //lower left to upper right Diagonal test for Tic-Tac-Toe
        if(!gameBoard[2][0].equals(" ") &&
                gameBoard[2][0].equals(gameBoard[1][1]) &&
                gameBoard[1][1].equals(gameBoard[0][2])) {
            return gameBoard[2][0];  //diagonal match!
        }//end if
        return "";  //no winner yet!
    }//end getWinner

    public static boolean isBoardFull(String[][] gameBoard) {

        int countFill = 0;

        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard.length; j++) {
                if(!gameBoard[i][j].equals(" ")) {
                    countFill++;
                }//end if
            }//end for j
        }//end for i
        return countFill == 9;  //all 9 spaces filled with non-space
    }//end isBoardFull
}//end class
