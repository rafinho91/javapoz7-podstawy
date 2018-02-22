package trzecie;

import java.util.Scanner;

public class Warmup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number to calculate factorial");
        int n = scanner.nextInt();
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("Factorial = " + factorial);
    }

    private static void ThirdWarmUp() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number of elements to sum only even numbers");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 2; i <= 2*n; i+=2) {
            if (i % 3 != 0) {
                sum += i;
            }
        }

        System.out.println("Sum is equal to: " + sum);
    }

    private static void SecondWarmUp() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number: ");
        int n = scanner.nextInt();
        int previousValue = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Insert " + (i + 1) + ". number");
            int value = scanner.nextInt();
            if (value > previousValue) {
                System.out.println("Number is bigger than the previous one");
            } else if (value < previousValue) {
                System.out.println("Number is smaller than the previous one");
            } else {
                System.out.println("Number is equal to the previous one");
            }
            previousValue = value;
        }
    }

    private static void FirstWarmUp() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Insert " + (i+1) + ". number");
            int a = scanner.nextInt();
            if (a % 6 == 0) {
                System.out.println("Number divides over 6");
            } else if (a % 3 == 0) {
                System.out.println("Number divides over 3");
            } else if (a % 2 == 0) {
                System.out.println("Number divides over 2");
            } else {
                System.out.println("Number does not divide over 2 or 3 or 6");
            }


        }
    }
}
