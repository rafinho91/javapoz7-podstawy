package czwarte;

import java.util.Arrays;

public class Homework {


    // ZADANIA NA WEEKEND
    // szyfr cezara - petla ktora wypisze znaki zakodowane i druga petla ktora to odkoduje
    // tablica liczb, definiujemy liczbe np. 3, tworzymy dwie tablice z niej z liczbami <= oraz z wiekszymi
    // zalozyc ze tablica jest posortowana i nieposortowana

    public static void main(String[] args) {
        int offset = 1;
        String secretMessage = "ala ma kota Z y";
        String expectedMessage = "cnc oc mqvc B a";

        // kodowanie
        char[] chars = secretMessage.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if ((chars[i] >= 'a' && chars[i] <= 'z') || chars[i] >= 'A' && chars[i] <= 'Z' ) {
                if (((chars[i] + offset) > 'Z' && (chars[i] + offset) < 'a') || ((chars[i] + offset) > 'z')) {
                    chars[i] = (char)(chars[i] - 26 + offset);
                } else {
                    chars[i] += offset;
                }
            }
        }
        System.out.println("Expected: " + expectedMessage);
        System.out.println("Actual: " + String.valueOf(chars));

        System.out.println("Correct= " + (expectedMessage.equals(String.valueOf(chars))));
//
//        // ODKODOWANIE

        int offsetDecode = 1;
        String codedMessage = String.valueOf(chars);

        char[] charsOfCodedMessage = codedMessage.toCharArray();
        for (int i = 0; i < charsOfCodedMessage.length; i++) {
            if ((charsOfCodedMessage[i] >= 'a' && charsOfCodedMessage[i] <= 'z') || charsOfCodedMessage[i] >= 'A' && charsOfCodedMessage[i] <= 'Z' ) {
                if (charsOfCodedMessage[i] == 'a' || charsOfCodedMessage[i] == 'A') {
                    charsOfCodedMessage[i] = (char)(charsOfCodedMessage[i] + 26 - offsetDecode);
                } else {
                    charsOfCodedMessage[i] -= offsetDecode;
                }
            }
        }
        System.out.println("Coded: " + codedMessage);
        System.out.println("Expected: " + secretMessage);
        System.out.println("Actual: " + String.valueOf(charsOfCodedMessage));

        System.out.println("Correct= " + (codedMessage.equals(String.valueOf(charsOfCodedMessage))));


        // tablica liczb, definiujemy liczbe np. 3, tworzymy dwie tablice z niej z liczbami <= oraz z wiekszymi

//        int[] numbers = {1,2,3,4,6,7,8};
//        int searchingNumber = 10;
//        int i = 0;
//
//        while(i < numbers.length && numbers[i] != searchingNumber) {
//            i++;
//        }
//        if (i < numbers.length) {
//            int[] smallerNumbersArray = new int[i+1];
//            int[] biggerNumbersArray = new int[numbers.length-(i+1)];
//
//            for (int j = 0; j < smallerNumbersArray.length; j++) {
//                smallerNumbersArray[j] = numbers[j];
//            }
//            for (int j = 0; j < biggerNumbersArray.length; j++) {
//                biggerNumbersArray[j] = numbers[j + i + 1];
//            }
//            System.out.println(Arrays.toString(numbers));
//            System.out.println(Arrays.toString(smallerNumbersArray));
//            System.out.println(Arrays.toString(biggerNumbersArray));
//
//        } else{
//            System.out.println("Number " + searchingNumber + " not found");
//        }
    }

}
