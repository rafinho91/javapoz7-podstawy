import java.util.Scanner;

public class Warmup {
    public static void main(String[] args) {
        Scanner side = new Scanner(System.in);

        System.out.println("Insert side a: ");
        int a = side.nextInt();
        System.out.println("Insert side b: ");
        int b = side.nextInt();
        System.out.println("Insert side c: ");
        int c = side.nextInt();

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        if (a + b > c && a + c > b && b + c > a && a*a + b*b == c*c){
            double area = 0.5 * (double)a * b;
            System.out.println("Area of this triangle is equal to: " + area);

            int perimeter = a + b + c;
            System.out.println("Perimeter of this triangle is equal to: " + perimeter);

            double averageSide = (a + b + c)/3.0;
            System.out.println("Average side length is equal to: " + averageSide);
        } else {
            System.out.println("Impossible to create a right triangle!!");
        }



    }
}
