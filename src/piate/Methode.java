package piate;

public class Methode {
    public static void main(String[] args) {
        int[] array = {2,3,3,4,4,3,2};
// shift+F6 zmiana nazwy we wszystkich odwolaniach

        printArray(array);
        int sum = sumOfArray(array);
        double avg= avg(array);
        int max = max(array);
        int min = min(array);
        int range = range(array);

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Range: " + range);
        printArray(statsOfOccurences(array));
        printArray(sortByCounting(array));


// metoda ktora zwraca wartosc najmniejszej liczby i metoda z najwiekszej liczby z tablicy
        // informacje o wystapieniach
        //mediana
        //rozpietosc
    }

    public static int[] sortByCounting(int[] array){
        int[] sortedArray = new int[array.length];
        int[] stats = statsOfOccurences(array);
        int k = 0;
        for (int i = 0; i < stats.length  ; i++) {
            for (int j = 0; j < stats[i]; j++) {
                sortedArray[k] = i + min(array);
                k++;
            }
        }
        return sortedArray;
    }

    public static int indexOfMax(int[] array) {
        int iMax = 0;
        for (int i = 0; i < array.length ; i++) {
            if (array[i] > array[iMax]){
                iMax = i;
            }
        }
        return iMax;
    }

    public static int moda(int[] array){
        int[] stats = statsOfOccurences(array);
        int indexOfMaximumValue = indexOfMax(stats);
        return indexOfMaximumValue + min(array);
    }

    public static int[] statsOfOccurences(int[] array){
        int[] statsArray = new int[range(array)];
        int min = min(array);
        for (int i = 0; i < array.length; i++) {
            statsArray[array[i] - min]++;
        }
        return statsArray;
    }

    public static int range(int[] array) {
        return max(array)-min(array) + 1;
    }

    public static int min(int[] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static int max(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static double avg(int[] array) {
        int sum = sumOfArray(array);
        return (double)sum/array.length;
    }


    public static int sumOfArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if(i != array.length - 1) {
                System.out.print(";");
            }
        }
        System.out.println("]");
    }
}



