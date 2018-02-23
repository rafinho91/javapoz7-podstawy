package czwarte;

public class Scope {
    public static void main(String[] args) {

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
    }
}
