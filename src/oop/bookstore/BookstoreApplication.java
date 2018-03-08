package oop.bookstore;

import java.util.Scanner;

public class BookstoreApplication {
    public static void main(String[] args) {
        System.out.println("======== BOOKSTORE =========");
        int answer;
        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[10];
        Author[] authors = new Author[10];

        do {
            System.out.println();
            System.out.println("1. Authors");
            System.out.println("2. Books");
            System.out.println("0. Exit");
            System.out.println();
            answer = scanner.nextInt();
            scanner.nextLine();

            switch (answer) {
                case 1:
                    listAuthors(scanner, authors);
                    break;
                case 2:
                    listBooks(scanner, books);
                    break;
            }
        } while(answer !=0);
    }

    public static void addBook(Scanner scanner, Book[] books) {
        System.out.println("Insert index");
        int index = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Insert title of the new book");
//        books[index]("Lol", 1950)  = scanner.nextLine();

    }

    public static void listAuthors(Scanner scanner, Author[] listOfAuthors) {
        System.out.println("List of authors: ");
        System.out.println("-----------------");
        list(listOfAuthors);
        scanner.nextLine();
    }

    public static void listBooks(Scanner scanner, Book[] listOfBooks) {
        System.out.println("List of books: ");
        System.out.println("-----------------");
        list(listOfBooks);
        scanner.nextLine();
    }

    public static void list(Object[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println((i+1) + ". " + array[i]);
        }
    }
}
