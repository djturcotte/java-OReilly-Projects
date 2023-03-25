import java.util.Scanner;

public class Proj6_2_TicTacToe {
    public static void main(String[] args) {

        runGame();

    }//end main

    public static void runGame() {
        String winner = " ";
        String[][] gameBoard = new String[3][3];
        boolean xTurn = true;
        boolean gameOver = false;
        int turnCount = 0;

        initializeGameBoard(gameBoard);
        printCurrentBoard(gameBoard);
        while(gameOver == false) {
            if(isBoardFull(gameBoard) == true) {
                gameOver = true;
                System.out.println("Cat's game!  It's a tie");
                winner = "C";
            } else {
                getUserInput(xTurn,gameBoard);
                if(xTurn == true) {
                    xTurn = false;
                    turnCount += 1;
                } else {
                    xTurn = true;
                    turnCount += 1;
                }//end if else
            }
            if(turnCount >=5) {
                winner = getWinner(gameBoard);
            }
            if(winner.equals("X") || winner.equals("O")) {
                gameOver = true;
            }
        }

        if (winner.equals("C")) {
            System.out.println();
            System.out.println("Cat's game!  It's a tie");
        }
        else if (winner.equals("X")) {
            System.out.println();
            System.out.println("The winner is X");
        }
        else if (winner.equals("O")) {
            System.out.println();
            System.out.println("The winner is O");
        }
    }//end runGame

    public static void initializeGameBoard(String[][] gameBoard) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                gameBoard[i][j] = " ";
            }
        }
    }//end initializeGameBoard

    public static void printCurrentBoard(String[][] gameBoard) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
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
        boolean validInput = false;
        int rowIn = 3;
        int colIn = 3;
        String entry;

        if(xTurn == true) {
            System.out.println("It's X's turn");
            entry = "x";
        } else {
            System.out.println("It's O's turn");
            entry = "o";
        }//end if else
        while(validInput == false) {
            System.out.println("Please enter the row and column, each from 0, 1, or 2, separated by a space");
            rowIn = keyboard.nextInt();
            colIn = keyboard.nextInt();
            if(rowIn >= 0 && rowIn <= 2) {
                if(colIn >= 0 && colIn <=2) {
                    validInput = true;
                } else {
                    validInput = false;
                    System.out.println("Invalid column entry");
                }//end inner if else
            } else {
                validInput = false;
                System.out.println("Invalid row entry");
            }
            if(cellAlreadyOccupied(rowIn, colIn, gameBoard)) {
                System.out.println("That cell is occupied!");
                validInput = false;
            }
        }
        if(isBoardFull(gameBoard) == true) {
            System.out.println("Game Board is Full! No Winner");
        }
        if(xTurn == true) {
            xTurn = false;
        }
        gameBoard[rowIn][colIn] = entry;
        printCurrentBoard(gameBoard);
    }//end getUserInput

    public static boolean cellAlreadyOccupied(int row, int col, String[][] gameBoard) {
        if(gameBoard[row][col] != " ") {
            return true;
        } else {
            return false;
        }
    }//end cellAlreadyOccupied

    public static String getWinner(String[][] gameBoard) {
        //Row tests for Tic-Tac-Toe
        if(gameBoard[0][0] == "x" && gameBoard[0][1] == "x" && gameBoard[0][2] == "x") {
            return "X";
        } else if(gameBoard[0][0] == "o" && gameBoard[0][1] == "o" && gameBoard[0][2] == "o") {
            return "O";
        } else if(gameBoard[1][0] == "x" && gameBoard[1][1] == "x" && gameBoard[1][2] == "x") {
            return "X";
        } else if(gameBoard[1][0] == "o" && gameBoard[1][1] == "o" && gameBoard[1][2] == "o") {
            return "O";
        } else if(gameBoard[2][0] == "x" && gameBoard[2][1] == "x" && gameBoard[2][2] == "x") {
            return "X";
        } else if(gameBoard[2][0] == "o" && gameBoard[2][1] == "o" && gameBoard[2][2] == "o") {
            return "O";
        }
        //Column tests for Tic-Tac-Toe
        if(gameBoard[0][0] == "x" && gameBoard[1][0] == "x" && gameBoard[2][0] == "x") {
            return "X";
        } else if(gameBoard[0][0] == "o" && gameBoard[1][0] == "o" && gameBoard[2][0] == "o") {
            return "O";
        } else if(gameBoard[0][1] == "x" && gameBoard[1][1] == "x" && gameBoard[2][1] == "x") {
            return "X";
        } else if(gameBoard[0][1] == "o" && gameBoard[1][1] == "o" && gameBoard[2][1] == "o") {
            return "O";
        } else if(gameBoard[0][2] == "x" && gameBoard[1][2] == "x" && gameBoard[2][2] == "x") {
            return "X";
        } else if(gameBoard[0][2] == "o" && gameBoard[1][2] == "o" && gameBoard[2][2] == "o") {
            return "O";
        }
        //Diagonal tests for Tic-Tac-Toe
        if(gameBoard[0][0] == "x" && gameBoard[1][1] == "x" && gameBoard[2][2] == "x") {
            return "X";
        } else if(gameBoard[0][0] == "o" && gameBoard[1][1] == "o" && gameBoard[2][1] == "o") {
            return "O";
        } else if(gameBoard[0][2] == "x" && gameBoard[1][1] == "x" && gameBoard[2][0] == "x") {
            return "X";
        } else if(gameBoard[0][2] == "o" && gameBoard[1][1] == "o" && gameBoard[2][0] == "o") {
            return "O";
        }
        return " ";
    }//end getWinner

    public static boolean isBoardFull(String[][] gameBoard) {
        String cell = " ";
        int cellCount = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cell = gameBoard[i][j];
                if(cell != " "){
                    cellCount += 1;
                }
            }
        }
        if(cellCount >= 9) {
            return true;
        } else {
            return false;
        }
    }//end isBoardFull
}
