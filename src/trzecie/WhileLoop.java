package trzecie;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 1;
        while (option != 0) {
            System.out.println("1. New");
            System.out.println("2. Load");
            System.out.println("3. About");
            System.out.println("0. Quit");

            option = scanner.nextInt();
            System.out.println();
        }
    }

    private static void Six() {
        System.out.println("Check value if primary: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int i = 2;
        boolean isPrimary = true;
        while(isPrimary && i <= value/2) {
            if ((value%i) == 0) {
                isPrimary = false;
            }
            i++;
        }
        if(isPrimary) {
            System.out.println("Number is primary");
        } else {
            System.out.println("Number is not primary");
        }
    }

    private static void Five() {
        System.out.println("Insert value you want to divide: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        for(int i = 1; i <= value/2; i++) {
            if ((value%i) == 0){
                System.out.println(i);
            }
        }
    }

    private static void Four() {
        System.out.println("How many digits in the number");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert value: ");
        int value = scanner.nextInt();
        System.out.println("Insert digit: ");
        int digit = scanner.nextInt();
        int numOfDigit = 0;
        if (value == 0 && digit == 0){
            numOfDigit++;
        }
        while(value != 0) {
            int rest = value % 10;
            if (rest == digit) {
                numOfDigit++;
            }
            value /= 10;
        }
        System.out.println("Digit " + digit + " appears " + numOfDigit + ". times");
    }

    private static void Three() {
        System.out.println("Looking for the sum of digits");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int sum = 0;
        while(value != 0) {
            int rest = value % 10;
            sum = sum + rest;
            value /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }

    private static void Two() {
        System.out.println("Looking for the number of digits");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int i = 0;
        if (value == 0) {
            i++;
        }
        while(value != 0) {
            i++;
            value = value / 10;
        }
        System.out.println("Number of digits is: " + i);
    }

    private static void One() {
        System.out.println("Looking for the biggest number of given");
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        boolean result = true;
        while (result) {
            int value = scanner.nextInt();
            result = value != 0;
            if (value > max) {
                max = value;
            }
        }
        System.out.println("The biggest value of given is " + max);
    }

    private static void ThirdLoop() {
        System.out.println("Looking for a sum of numbers");
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        boolean result = true;
        while (result) {
            int value = scanner.nextInt();
            sum += value;
            if (value == 0) {
                result = false;
            }
            // result = value != 0;
        }
        System.out.println("The sum of given numbers is equal to " + sum);
    }

    private static void SecondWhile() {
        System.out.println("Looking for a number divisible over 15");
        Scanner scanner = new Scanner(System.in);
        int value = 1;
        while(value % 15 != 0) {
            System.out.println("Insert number: ");
            int a = scanner.nextInt();
            value = a;
        }
        System.out.println("Number " + value + " is divisible over 15");
    }

    private static void FirstWhile() {
        System.out.println("Insert your limit sum: ");
        Scanner scanner = new Scanner(System.in);
        int limitSum = scanner.nextInt();
        int tmp = 0;
        int i = 0;
        while(tmp < limitSum) {
            System.out.println("Insert next number: ");
            int value = scanner.nextInt();
            i++;
            tmp += value;
        }
        System.out.println("You inserted " + i + " numbers");
    }
}
