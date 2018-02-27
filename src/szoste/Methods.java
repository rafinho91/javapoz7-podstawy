package szoste;

public class Methods {
    public static void main(String[] args) {
        // silnia z jakiejs liczby long
        // zamiana jednego znaku na drugi w danym stringu w tekscie wszystkie znaki old na new
        // zliczamy liczby podzielne przez 2 ale nie podzielne przez 3
        // split -> text, delimiter
        // ciag fibonacciego
        // sprawdzenie czy string jest liczba
        // sprawdzenie nawiasow w stringu
        // metoda do porownania dwoch stringow ktore sa liczbami
        // rozlozenie na sume liczb pierwszych danej liczby
        // czy tekst jest polidromem

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
    }

    public  static String[] split(String message, char c) {
        String[] array = new String[Warmup.lettersCounter(message,c)];
        int start = 0;
 //       int end = getNIndexOf(c, message, 0);
        return array;
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
