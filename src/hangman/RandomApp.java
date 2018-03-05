package hangman;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomApp {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(randomArray(10)));
        System.out.println(Arrays.toString(usersRandomArray()));
    }

    // 10 losowych liczb parzystych z zakresu 0 - 10 wlacznie

    public static void sum(){
        int[] array = randomArray(5);
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum = " + sum);
    }

    public static int[] randomArray(int n) {
        Random random = new Random();
        int[] randomArray = new int[n];
        for (int i = 0; i < n; i++) {
            randomArray[i] = random.nextInt(50);
        }
        return randomArray;
    }

    public static int[] usersRandomArray(){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert length of array");
        int arrayLength = scanner.nextInt();
        System.out.println("Insert bound");
        int bound = scanner.nextInt();
        System.out.println("Insert offset");
        int offset = scanner.nextInt();
        int[] usersRandomArray = new int[arrayLength];
        for (int i = 0; i < usersRandomArray.length; i++) {
            usersRandomArray[i] = random.nextInt(bound) + offset;
        }
        return usersRandomArray;
    }


}
