package moreless;

import java.util.Random;
import java.util.Scanner;

public class MoreLessApplication {
    public static void main(String[] args) {
        System.out.println("======== MORE LESS APP =========");
        Scanner scanner = new Scanner(System.in);
        int answer;

        do {
            System.out.println();
            System.out.println("1. Start game");
            System.out.println("2. Auto game");
            System.out.println("3. Rules");
            System.out.println("0. Exit");
            System.out.println();

            answer = scanner.nextInt();
            scanner.nextLine();
            switch (answer) {
                case 1:
                    startGame(scanner);
                    break;
                case 2:
                    measureDummyBot();
                    measureSmartBot();
                    break;
                case 3:
                    showRules();
                    break;
            }

        }while (answer != 0);
    }

    private static void measureSmartBot() {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += smartBot(getRandomNumber());
        }

        System.out.println("Smart bot average result from 100. games is: -" + sum/100);
    }

    private static int smartBot(int randomNumber) {
        int guess = 50;
        int counter = 0;
        int offset = 0;
        do {
            counter++;
            guess = guess + offset;
            if (compare(guess,randomNumber) == 1){
                offset = -25/counter;
            } else if (compare(guess,randomNumber) == -1){
                offset = 25/counter;
            }
        }while(compare(guess, randomNumber) != 0);
        return counter;
    }

    private static void measureDummyBot() {
        //sto razy wolamy dummy bota i obliczmy srednia
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += dummyBot(getRandomNumber());
        }

        System.out.println("Dummy bot average result from 100. games is: -" + sum/100);
    }

    private static int dummyBot(int randomNumber) {
        int guess;
        int counter = 0;
        Random random = new Random();
        do {
            guess = random.nextInt(101);
            counter++;
        }while(compare(guess, randomNumber) != 0);
//        System.out.println("Dummy bot result: -" + counter);
        return counter;

//        int randomNumber = getRandomNumber();
//        int result = 1;
//        int guess;
//        do{
//            guess = random.nextInt();
//            if (guess > randomNumber){
//                System.out.println("The number is too big");
//                result++;
//            } else if (guess < randomNumber){
//                System.out.println("The number is too small");
//                result++;
//            }
//        }while(guess != randomNumber);
//        System.out.println("You won. Your result: -" + result + " points");

    }

    private static void showRules() {
        System.out.println("The computer chooses a random number from 0 - 100. As you guess the number, it gives you tips.");
//        System.out.println();
//        System.out.println("Press any key to continue...");
    }

    private static void startGame(Scanner scanner) {
        System.out.println("Press any key to continue...");
        scanner.nextLine();
        int randomNumber = getRandomNumber();
        guessTips(scanner, randomNumber);


//        System.out.println("Press any key to continue..");
//        scanner.nextLine();

    }

    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(101);
    }

    public static void guessTips(Scanner scanner, int randomNumber) {
        int result = 0;
        int guess;
        do{
            System.out.println("Guess the number??");
            guess = scanner.nextInt();
            scanner.nextLine();
            result++;
            gameStep(guess, randomNumber);
        }while(guess != randomNumber);
        System.out.println("You won. Your result: -" + result + " points");
    }

    private static void gameStep(int guess, int randomNumber){
        if (compare(guess,randomNumber) == 1){
            System.out.println("The number is too big");
        } else if (compare(guess,randomNumber) == -1){
            System.out.println("The number is too small");
        }
    }

    public static int compare(int number, int secretNumber){
//        return Integer.compare(number, secretNumber);
        return number < secretNumber ? -1 : (number > secretNumber ? 1 : 0);
    }
}
