package oop;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        User user = createUser(scanner);
        System.out.println(user.firstName + " " + user.lastName +
                ", phone number: " + user.phoneNumber + ", email: " + user.email);



        Address address = new Address();
        address.city = "Poznan";
        address.country = "Polska";
        address.houseNumber = 50;
        address.postalCode = "60-300";
        address.street = "Polwiejska";

        user.address = address;
        user.introduceYourself();

    }

    public static User createUser(Scanner scanner){
        System.out.println("Insert first name");
        String firstName = scanner.nextLine();
        System.out.println("Insert last name");
        String lastName = scanner.nextLine();

        User user = new User(firstName, lastName);

        System.out.println("Insert first name");
        user.firstName = scanner.nextLine();

        System.out.println("Insert last name");
        user.lastName = scanner.nextLine();

        System.out.println("Insert phone number");
        user.phoneNumber = scanner.nextLine();

        System.out.println("Insert email");
        user.email = scanner.nextLine();

        return user;
    }
}
