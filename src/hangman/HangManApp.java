package hangman;

import java.util.Random;
import java.util.Scanner;

public class HangManApp {
    public static void main(String[] args) {
        System.out.println("======== HANGMAN APP =========");

        int answer;

        do {
            System.out.println();
            System.out.println("1. Start");
            System.out.println("2. About");
            System.out.println("0. Exit");
            System.out.println();
            Scanner scanner = new Scanner(System.in);
            answer = scanner.nextInt();
            scanner.nextLine();

            switch (answer) {
                case 1:
                    startGame(scanner);
                    break;
                case 2:
                    showHighScores(scanner);
                    break;
            }
        } while(answer !=0);
    }

    private static void startGame(Scanner scanner) {
        Random random = new Random();
        random.nextInt();
    }

    private static void showHighScores(Scanner scanner) {
    }


}
