package szoste;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        // silnia z jakiejs liczby long
        // zamiana jednego znaku na drugi w danym stringu w tekscie wszystkie znaki old na new
        // zliczamy liczby podzielne przez 2 ale nie podzielne przez 3
        // sprawdzenie czy string jest liczba
        // czy tekst jest polidromem
        // zamiana wielkosci wszystkich liter
        // split -> text, delimiter
        // ciag fibonacciego
        // sprawdzenie nawiasow w stringu
        // metoda do porownania dwoch stringow ktore sa liczbami
        // rozlozenie na sume liczb pierwszych danej liczby


        int number = 4;
        System.out.println("Factorial of number " + number + " is: " + factorial(number));

        int[] array = {2,4,5,6,8,9,10};
        System.out.println("Divisible by 2 not 3 : " + countDivisible2Not3(array));

        String text = "Ala ma kota";
        System.out.println(text + " - after exchange - " +letterExchange(text, ' ', '+'));

        String possibleNumber = "2676";
        System.out.println("Is " + possibleNumber + " a number? " + isStringNumber(possibleNumber));

        String possiblePalindrom = "Kobylamamalybok";
        System.out.println("Is " + possiblePalindrom + " a palindrom? " + palindrom(possiblePalindrom));

        char c = 'z';
        System.out.println(c + " - switched is - " + switchChar(c));
        String textCase =  "Ala Ma Kota";
        System.out.println(textCase + " - switched case is - "+ switchCase(textCase));

        System.out.println("a;b;c 0 (-1) = " + getNthIndexOf(';',"a;b;c", 0));
        System.out.println("a;b;c 1 (1) = " + getNthIndexOf(';',"a;b;c", 1));
        System.out.println("a;b;c 2 (3) = " + getNthIndexOf(';',"a;b;c", 2));
        System.out.println("a;b;c 3 (5) = " + getNthIndexOf(';',"a;b;c", 3));

        System.out.println("\"Ala ma kota\" split = " + Arrays.toString(split("Ala ma kota ",' ')));
        System.out.println("\"Ala ma kota\" split2 = " + Arrays.toString(split2("Ala ma kota ",' ')));

        int numberFib = 6;
        System.out.println("Fibonacci on position " + numberFib + ". = " + fibonacciRalf(numberFib));
        System.out.println("Fibonacci on position " + numberFib + ". = " + fibonacciNumber(numberFib));
        System.out.println("Fibonacci array for " + numberFib + " positions is " + Arrays.toString(fibonacciArray(numberFib)));

        String textToSwap = "Aleksandra";
        System.out.println(reverse(textToSwap));

        String statement = "3+(3*3)/(5-5-(-7))";
        System.out.println(statement + " Is valid? : " + isValidStatement(statement));

        System.out.println("Reversed array [1,2,3,4,5] = " + Arrays.toString(reversedArray(new int[]{1,2,3,4,5})));

        System.out.println("\n" + tree(5));

        System.out.println("Compare: \"1234\" and \"1234\" = \t" + compareStringNumbers("1234", "1234"));

        int primNumber = 23;
        primarySum(primNumber);
        System.out.println("Number " + primNumber + " is a sum of primaries = " + primaryNumbersOf(primNumber));

    }

    public static String primaryNumbersOf(int number){
        int[] primaryNumbers = {1,2,3,5,7,11};
        StringBuilder sumOfPrimaries = new StringBuilder();
        for (int i = primaryNumbers.length - 1; i >= 0 ; i--) {
            while (number >= primaryNumbers[i]){
                number -= primaryNumbers[i];
                sumOfPrimaries.append(primaryNumbers[i] + " + ");
            }
        }
        return sumOfPrimaries.substring(0,sumOfPrimaries.length() - 2);
    }

    public static void primarySum(int number){
        int[] primaryNumbers = {1,2,3,5,7,11};
        int i = primaryNumbers.length - 1;
        int temp = 0;
        int newNumber = number;
        StringBuilder sumOfPrimaries = new StringBuilder();
        while (i >= 0) {
            temp = newNumber - primaryNumbers[i];
            if (temp < 0) {
                i--;
            } else if (temp > 0) {
                sumOfPrimaries.append(primaryNumbers[i] + " + ");
                newNumber = temp;
            }else{
                sumOfPrimaries.append(primaryNumbers[i]);
                i = -1;
            }
        }
        System.out.println("Number " + number + " is a sum of primaries = " + sumOfPrimaries);
    }

    public static int compareStringNumbers(String firstNumber, String secondNumber){
        int result = 0;
        if (firstNumber.length() > secondNumber.length()){
            result = 1;
        }else if(firstNumber.length() < secondNumber.length()){
            result = -1;
        }else{
            int i = 0;
            while(i < firstNumber.length() && result == 0){
                if(firstNumber.charAt(i) > secondNumber.charAt(i)){
                    result = 1;
                }else if(firstNumber.charAt(i) < secondNumber.charAt(i)){
                    result = -1;
                }
                i++;
            }
        }
        return result;
    }

    //drzewko, -- immutability of String --
    public static String tree(int height){
        StringBuilder treeBuilder = new StringBuilder();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - 1 - i; j++) {
                treeBuilder.append(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                treeBuilder.append("*");
            }
            treeBuilder.append("\n");
        }
        return treeBuilder.toString();
    }

    public static int[] reversedArray(int[] array){
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[array.length - 1 - i];
        }
        return newArray;
    }

    public static boolean isValidStatement(String statement){
        char[] chars = statement.toCharArray();
        int i = 0;
        int counter = 0;
        while (counter >= 0 && i < chars.length){
            if (chars[i] == '('){
                counter++;
            } else if(chars[i] == ')'){
                counter--;
            }
            i++;
        }
        return counter == 0;
    }

    public static String reverse(String text){
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length/2; i++) {
            char tmp = chars[i];
            chars[i] = chars[chars.length-1-i];
            chars[chars.length-1-i] = tmp;
        }
        return String.valueOf(chars);
    }

    public static int[] fibonacciArray(int n){
        if(n <= 1){
            int[] array = {0};
            return array;
        }
        int[] array = new int[n];
        array[0] = 0;
        array[1] = 1;
//        for (int i = 2; i < n; i++) {
//            array[i-1] = fibonacciNumber(i);
//        }
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i-1] + array[i-2];
        }
        return array;
    }

    public static int fibonacciNumber(int n){
        if(n <= 1) return 0;
        int first = 0;
        int second = 1;
        for (int i = 2; i < n; i++) {
            int next = first + second;
            first = second;
            second = next;
        }
        return second;
    }

    public static int fibonacciRalf(int n){
        if(n <= 1) return 0;
        int[] array = new int[n];
        array[0] = 0;
        array[1] = 1;
        for (int i = 0; i < array.length-2; i++) {
                array[i+2] = array[i+1] + array[i];
        }
        return array[n-1];
    }

    public static String[] split2(String message, char c){
        int size = Warmup.lettersCounter(message,c) + 1;
        String[] resultArray = new String[size];
        int start = 0;
        for (int i = 0; i < resultArray.length; i++) {
            String textToPut = "";
            int end = getNthIndexOf(c,message,(i+1));
            for (int j = start; j < end; j++) {
                textToPut += message.charAt(j);
            }
            resultArray[i] = textToPut;
            start = end + 1;
        }
        return resultArray;
    }

    public  static String[] split(String message, char c) {
        int size = Warmup.lettersCounter(message,c) + 1;
        String[] resultArray = new String[size];
        String textToPut = "";
        int j = 0;
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) != c) {
                textToPut += message.charAt(i);
                if (i == message.length()-1){
                    resultArray[j] = textToPut;
                }
            } else {
                resultArray[j] = textToPut;
                j++;
                textToPut = "";
            }
        }
        return resultArray;
    }

    public static int getNthIndexOf(char c, String text, int index){
        char[] chars = text.toCharArray();
        int i = -1;
        while (i < chars.length && index > 0) {
            i++;
            if (i < chars.length && c == chars[i]){
                index--;
            }
        }
        return i;
    }

    public static String switchCase(String text){
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = switchChar(chars[i]);
        }
        return String.valueOf(chars);
    }

    public static char switchChar(char c){
        if (c >= 'a' && c <= 'z'){
            c = (char)(c-(97 - 65));
        } else if(c >= 'A' && c <= 'Z'){
            c = (char)(c+(97 - 65));
        }
        return c;
    }

    public static boolean palindrom(String text){
        char[] chars = text.toCharArray();
        int i = 0;
        while (i < chars.length/2 && Warmup.capitalize(chars[i]) == Warmup.capitalize(chars[chars.length - i - 1])){
            i++;
        }
        return i == chars.length/2;
    }

    public static boolean isStringNumber(String text){
        char[] array = text.toCharArray();
        int i = 0;
        while (i < array.length && array[i] >= '0' && array[i] <= '9') {
            i++;
        }
        return i == array.length;
    }

    public static String letterExchange(String text, char searchedLetter, char letterToInsert){
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == searchedLetter){
                chars[i] = letterToInsert;
            }
        }
        return String.valueOf(chars);
    }

    public static int countDivisible2Not3(int[] array){
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] % 3 != 0){
                counter++;
            }
        }
        return  counter;
    }

    public static long factorial(int number){
        long factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
