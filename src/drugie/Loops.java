package drugie;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        sixthLoop();
    }

    private static void sixthLoop() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Following sums");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i < n+1; i++) {
            sum = sum + i;
            System.out.println(sum);
        }
    }

    private static void fifthLoop() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Following numbers to the second power");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(i*i);
        }
    }

    private static void fourthLoop() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times you want to display letter: a");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println((i+1) + ". a");
    }
    }

    private static void thirdLoop() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number of elements to choose from, these that divides over 3");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            if ((i+1) % 3 == 0)
            System.out.println(i+1);
        }
    }

    private static void secondLoop() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number of elements to choose only even numbers");
        int n = scanner.nextInt();

        for (int i = 2; i <= n; i+=2) {
                System.out.println(i);
        }
    }

    private static void firstLoop() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number of elements to display");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }

    private static void forLoopExample() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number of elements to multiply");
        int n = scanner.nextInt();
        System.out.println("Insert numbers you want to power");

        // i+=3  adding 3
        for (int i = 0; i < n; i = i++) {
            int number = scanner.nextInt();
            if (number >= 5 && number <= 20) {
                System.out.println((i + 1) + ". Power of " + number + " is " + (number * number));
            } else {
                System.out.println("Number not supported! Upgrade to full version!");
            }
        }
        System.out.println("End of program");
    }
}
