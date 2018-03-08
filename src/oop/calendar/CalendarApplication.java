package oop.calendar;

import java.util.Scanner;

public class CalendarApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalendarMonth calendarMonth = CalendarMonth.of("march", 2018, 3, 31, 4);
        int answer;

        do {
            System.out.println("==== CALENDAR APPLICATION =====");
            System.out.println();
            System.out.println("1. Show calendar");
            System.out.println("2. Switch month {month numberOfDays startingWeekDay}");
            System.out.println("0. Exit");
            System.out.println();

            answer = scanner.nextInt();
            scanner.nextLine();

            switch(answer) {
                case 1:
                    showMonth(scanner, calendarMonth);
                    break;
                case 2:
                    switchMonth(scanner);
                    break;
                    default:
                        System.out.println("Invalid command");
            }

        }while (answer != 0);

    }

    private static void showMonth(Scanner scanner, CalendarMonth calendarMonth) {
        System.out.println(calendarMonth);
        System.out.println("1. Add notes, 2. Show notes, 3. Remove notes");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                int dayNumber = scanner.nextInt();
                String note = scanner.nextLine();
                calendarMonth.setNoteForDay(note, dayNumber);
                break;
            case 2:
                break;
            case 3:
                break;
                default:
                    break;
        }
    }


    private static void switchMonth(Scanner scanner) {

    }
}
