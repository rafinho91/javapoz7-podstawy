package czwarte;

import java.util.Scanner;

public class Warmup {
    public static void main(String[] args) {
    }

    private static void three() {
        int numberWithZeros = 20304050;
        int numberWithoutZeros = 0;
        int multiplier = 1;
        while(numberWithZeros != 0) {
            int digit = numberWithZeros % 10;
            if (digit != 0){
                numberWithoutZeros += digit * multiplier;
                multiplier *= 10;
            }
            numberWithZeros /= 10;
        }
        System.out.println("numberWithoutZeros=" + numberWithoutZeros);
    }

    private static void two() {
        System.out.println("How many numbers: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int sum = 0;

        for(int i=0; i<value; i++) {
            System.out.println("Insert a number to sum digits: ");
            int number = scanner.nextInt();
            while (number != 0) {
                int digit = number % 10;
                sum += digit;
                number /= 10;
            }
        }
        System.out.println(sum);
    }

    private static void one() {
        System.out.println("Insert a number to reverse: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int reversedNumber = 0;

        while(value != 0) {
            int digit = value%10;
            reversedNumber *= 10;
            reversedNumber += digit;
            value /= 10;
        }

        System.out.println("Your number backwards is: " + reversedNumber);
    }
}
