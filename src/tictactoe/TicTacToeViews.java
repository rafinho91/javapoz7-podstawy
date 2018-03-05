package tictactoe;

import java.util.Scanner;

public class TicTacToeViews {
    public static void main(String[] args) {
        char[] board = "123456789".toCharArray();
        board[4] = 'X';
        boardView(board);
    }


    public static void menuView() {
        System.out.println("1. start");
        System.out.println("0. wyjdz");
    }

    public static void boardView(char[] gameStatus) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < gameStatus.length; i++) {
            stringBuilder.append(gameStatus[i]);
            if(i != gameStatus.length - 1  && (i+1) % 3 == 0) {
                stringBuilder.append("\n");
                stringBuilder.append("-----");
                stringBuilder.append("\n");
            }else if (i != gameStatus.length - 1 ){
                stringBuilder.append("|");
            }
        }
        System.out.println(stringBuilder.toString());
    }

    public static void loserEndGame(char currentSign) {
        System.out.println("Loser is: " + currentSign);
    }

    public static void drawEndGame() {
        System.out.println("Draw");
    }

    public static void invalidValueFromUserMessage() {
        System.out.println("Invalid value. Try again");
    }
}
