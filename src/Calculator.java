import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("CALCULATOR");

        Scanner reader = new Scanner(System.in);
        System.out.println("Insert first value");
        int firstValue = reader.nextInt();
        System.out.println("Insert second value");
        int secondValue = reader.nextInt();

        int resultOfAddition = firstValue + secondValue;
        int resultOfSubtraction = firstValue - secondValue;
        int resultOfMultiplication = firstValue * secondValue;
        double resultOfDivision = 0;
        if (secondValue != 0) {
            resultOfDivision = (double)firstValue / secondValue;
        }

        System.out.println("Result of addition is " + resultOfAddition);
        System.out.println("Result of substraction is " + resultOfSubtraction);
        System.out.println("Result of multiplication is " + resultOfMultiplication);
        if (secondValue != 0) {
            System.out.println("Result of division is " + resultOfDivision);
        }

       // System.out.println("Result of division is " + resultOfDivision);

        System.out.println(firstValue + " + " + secondValue + " = " + (firstValue + secondValue));
        System.out.println(firstValue + " - " + secondValue + " = " + (firstValue - secondValue));
        System.out.println(firstValue + " * " + secondValue + " = " + (firstValue * secondValue));
        if (secondValue==0) {
            System.out.println("Impossible to divide with 0!!!");
        }

            else {
            System.out.println(firstValue + " : " + secondValue + " = " + (firstValue / (double) secondValue));
        }


        if (firstValue > secondValue) {
            System.out.println("First value is bigger than second");
        } else if (firstValue < secondValue) {
            System.out.println("First value is smaller than second");
        } else {
            System.out.println("Values are equal");
        }
        if (firstValue == secondValue) {
            System.out.println("First value is equal to second");
        } else {
            System.out.println("Values are different");
        }
        if (secondValue != 0) {
            if ((firstValue % secondValue)==0) {
                System.out.println("First value divides without rest");
            } else {
                System.out.println("Values divides with rest");
            }
        }
        if ((firstValue % 2) == 0) {
            System.out.println("First value is an even number");
        } else {
            System.out.println("First value is odd");
        }
        if ((secondValue % 2) == 0) {
            System.out.println("Second value is an even number");
        } else {
            System.out.println("Second value is odd");
        }



        // int someValue = reader.nextInt();   //zczytuje od uzytkownika liczbe calkowita
       // System.out.println(someValue);
    }
}
