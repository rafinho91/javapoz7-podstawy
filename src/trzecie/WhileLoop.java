package trzecie;

import java.util.Scanner;

//wczytuje liczby az nie bedzie ona podzielna przez 15, wyswietlamy te liczbe
//wczytuje az ktos nie poda 0, wyswietlamy sume
public class WhileLoop {
    public static void main(String[] args) {
        ThirdLoop();
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
