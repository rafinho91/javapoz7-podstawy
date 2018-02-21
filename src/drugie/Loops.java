package drugie;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number of elements to multiply");
        int n = scanner.nextInt();

        // i+=3  adding 3
        for (int i = 0; i < n; i = i++) {
            int number = scanner.nextInt();
            if (number >= 5 && number <= 20) {
                System.out.println((i+1) + ". Power of " + number + " is " + (number*number));
            }
            System.out.println("Number not supported! Upgrade to full version!");
        }
        System.out.println("End of program");

      //  int a = scanner.nextInt();
      //  int b = scanner.nextInt();
      //  int c = scanner.nextInt();
      //  int d = scanner.nextInt();
      //  int e = scanner.nextInt();
      //  System.out.println("Sum = " + (a + b + c + d + e));
    }
}
