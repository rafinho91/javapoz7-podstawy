package czwarte;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Scope {
    public static void main(String[] args) {

        // ZADANIA NA WEEKEND
        // szyfr cezara - petla ktora wypisze znaki zakodowane i druga petla ktora to odkoduje
        // tablica liczb, definiujemy liczbe np. 3, tworzymy dwie tablice z niej z liczbami <= oraz z wiekszymi
        // zalozyc ze tablica jest posortowana i nieposortowana





//        int searchingNumber = 6;
//        int[] sortedArray = {1,3,5,6,7,8,9};
//        int counter = 0;
//        while (counter < sortedArray.length && sortedArray[counter] != 6) {
//            counter ++;
//        }
//        System.out.println("We have " + counter + ". smaller than " + searchingNumber);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Insert size of Array");
//        int sizeOfUserArray = scanner.nextInt();
//        int[] userArray = new int[sizeOfUserArray];
//        int sumOfUserArray = 0;
//        for (int i = 0; i < userArray.length; i++) {
//            System.out.println("Insert next value");
//            userArray[i] = scanner.nextInt();
//            sumOfUserArray += userArray[i];
//        }
//        System.out.println("Average = " + (double)sumOfUserArray/userArray.length);

//        int size = 5;
//        int[] descendingNumbers = new int[size];
//        for (int i = 0; i < size; i++) {
//            descendingNumbers[i] = descendingNumbers.length - i;
//        }
//        System.out.println(Arrays.toString(descendingNumbers));

//        int[] arrayOfEvenNumbers = new int[5];
//        for (int i = 0; i < arrayOfEvenNumbers.length; i++) {
//            arrayOfEvenNumbers[i] = (i+1)*2;
//        }
//        System.out.println(Arrays.toString(arrayOfEvenNumbers));

//        int n = 4;
//        int[] newArray = new int[n];
//        for (int i = 0; i < newArray.length; i++) {
//            newArray[i] = i + 1;
//        }
//        System.out.println(Arrays.toString(newArray));

//        int[] arrayToBeDoubled = {1,2,3,4,5,6};
//        for (int i = 0; i < arrayToBeDoubled.length; i++) {
//            arrayToBeDoubled[i] *= 2;
//        }
//        System.out.println(Arrays.toString(arrayToBeDoubled));

//        int[] arrayWithValue = {2,4,5,9,0};
//            int counter = 0;
//            while (counter < arrayWithValue.length && arrayWithValue[counter] >= 0) {
//               counter++;
//            }
//            System.out.println("counter of positive numbers: " + counter);

//        int[] array = {64,4,25,-6};
//        int max = array[0];
//        int min = array[0];
//        for(int i = 1; i < array.length; i++) {
//            if (array[i] > max) {
//                max = array[i];
//            }
//            if (array[i] < min) {
//                min = array[i];
//            }
//
//        }
//        System.out.println("Max: " + max);
//        System.out.println("Min: " + min);

//        int[] array = {1,0,2,4};
//        int sum = 0;
//        for(int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }
//        System.out.println("Average: " + (double)sum/array.length);

//        int[] array = {3,4,0,0,0,10};
//        int sum = 0;
//        for(int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }
//        System.out.println("Sum: " + sum);

    }

    private static void Arrays() {
        String message = "Hello World!";
        char[] messageAsCharArray = message.toCharArray();
        int length = messageAsCharArray.length;
        System.out.println(messageAsCharArray[0]);
        System.out.println(messageAsCharArray[4]);

        int[] array = {1,2,3,4,5,6};
        for(int i = 0; i<array.length; i++){
            System.out.println(array[i]);
        }

        int size = 10;
        int[] emptyArray = new int[size];

        char a = (char)97;
        for (int i = 0; i <= 122-97; i++) {
            System.out.println(a + (char)i);
        }
        System.out.println("End of ALPHABET");

        for (int i = 97; i <= 122; i++) {
            System.out.println((char)i);
        }
        System.out.println("End of ALPHABET");
    }

    private static void binary() {
        int number = 1;
        int multiplier = 1;
        int binaryCode = 0;

        while (number != 0) {
            int bit = number % 2;
            binaryCode += bit * multiplier;
            multiplier *= 10;
            number /= 2;
        }
        System.out.println("Binary code: " + binaryCode);
    }

    private static void scope() {
        int number = 1500000000;
        System.out.println(number + number);
        System.out.println("Max value: " + (Integer.MAX_VALUE));
        System.out.println("Min value: " + (Integer.MIN_VALUE));

        long bigNumber = 300000000;
        System.out.println(bigNumber);
        System.out.println("Max value: " + (Long.MAX_VALUE));
        System.out.println("Min value: " + (Long.MIN_VALUE));

        System.out.println(Double.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);

        String message = "Hello World!";
        char c = 'a';
    }
}
