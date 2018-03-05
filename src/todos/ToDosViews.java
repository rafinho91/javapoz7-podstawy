package todos;

import java.util.Scanner;

public class ToDosViews {

    public static void menuView() {
        System.out.println();
        System.out.println("1. Add new TO DO");
        System.out.println("2. View TO DO list");
        System.out.println("3. Delete TO DO");
        System.out.println("0. Exit");
        System.out.println();
    }

    public static void noSpaceWarningMessage() {
        System.out.println("No more space for new TO DOs");
        System.out.println();
    }

    public static void waitForUser(Scanner scanner) {
        System.out.println();
        System.out.println("Press any key to continue..");
        scanner.nextLine();
    }

    public static void newToDoMessage() {
        System.out.println("Add a new TO DO: ");
    }

    public static void noToDoViewsDisplayMessage() {
        System.out.println("No TO DOs to display");
    }

    public static void deleteToDoMessage() {
        System.out.println("Which TO DO you want to delete?");
    }

    public static void toDoDeletedMessage() {
        System.out.println("... Deleted!!");
        System.out.println();
    }
}
