import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        // pobrac wiek od usera
        // jezeli wiek<6 to idz do przedszkola
        // jezeli wiek<13 idz to podstawowki
        // jezeli wiek<16 gimnazjum
        // jezeli wiek<20 srednia

        System.out.println("=== SCHOOL CHOOSER ===");
        System.out.println(" ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert age of the person: ");
        int age = scanner.nextInt();

        if (age < 6) {
            System.out.println("Go to the kindergarten!");
        } else if(age < 13) {
            System.out.println("Go to the primary school!");
        } else if(age < 16) {
            System.out.println("Go to the junior high school!");
        } else if(age < 20) {
            System.out.println("Go to the high school!");
        } else {
            System.out.println("Go to the university!");
        }

        if (age > 30 && age%3==0) {
            System.out.println("a");
        }
        if ((age < 15 || age > 60) && age%5 != 0) {
            System.out.println("b");
        }
    }
}
