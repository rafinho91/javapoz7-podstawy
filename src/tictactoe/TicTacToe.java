package tictactoe;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        int answer;
        Scanner scanner = new Scanner(System.in);
        do{
            TicTacToeViews.menuView();
            answer = scanner.nextInt();
            switch (answer) {
                case 1:
                    startGame(scanner);
                    break;
            }
        }while(answer != 0);
    }

    public static void startGame(Scanner scanner) {
        boolean result = true;
        char cross = 'X';
        char circle = 'O';
        char currentSign = cross;
        char[] board = "123456789".toCharArray();
        int i = 0;
        do {
            TicTacToeViews.boardView(board);
            int position = askForPosition(scanner,board);
            markSign(currentSign, board, position);
            currentSign = currentSign == 'X' ? circle : cross;
            i++;
        } while(i < 9 && !gameFinished(board));
        TicTacToeViews.boardView(board);
        System.out.println("End of game");
        if(!gameFinished(board)){
            TicTacToeViews.drawEndGame();
        }else{
            TicTacToeViews.loserEndGame(currentSign);
        }
    }

    private static boolean gameFinished(char[] board) {
          return isFirstDiagonalEqual(board) ||
                  isSecondDiagonalEqual(board) ||
                  isAnyVerticalEqual(board) ||
                  isAnyHorizontalEqual(board);


    }

    private static boolean isAnyHorizontalEqual(char[] board) {
        int i = 0;
        boolean result = false;
        while (result && i < 3){
            result = equals(board, i*3, i*3+1, i*3+1);
            i++;
        }
        return result;
    }

    private static boolean isAnyVerticalEqual(char[] board) {
        int i = 0;
        boolean result = false;
        while (result && i < 3){
            result = equals(board, i, i+3, i+6);
            i++;
        }
        return result;
    }

    private static boolean isSecondDiagonalEqual(char[] board) {
        return equals(board,2,4,6);
    }

    private static boolean isFirstDiagonalEqual(char[] board) {
        return equals(board,0,4,8);
    }

    private static boolean equals(char[] board, int i1, int i2, int i3 ){
        return board[i1] == board[i2] && board[i3] == board[i3];
    }

    private static void markSign(char currentSign, char[] board, int position) {
        board[position] = currentSign;
    }

    public static int askForPosition(Scanner scanner, char[] board){
        int position;
        do {
            position = scanner.nextInt();
            if (!isValidPosition(position, board)){
                TicTacToeViews.invalidValueFromUserMessage();
            }
        }while(!isValidPosition(position,board));
        return position-1;
    }

    private static boolean isValidPosition(int position, char[] board) {
        return (position >= 1 && position <= 9) && board[position-1] != 'X' && board[position-1] != 'O';
    }


}
