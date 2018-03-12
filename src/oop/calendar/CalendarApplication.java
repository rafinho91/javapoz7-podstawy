package oop.calendar;

import java.time.LocalDate;
import java.util.Scanner;

public class CalendarApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        LocalDate now = LocalDate.now();
        int answer;
//        int option = 0;
        CalendarMonth calendarMonth = CalendarMonth.currentMonth();

        do {
//            CalendarMonth calendarMonth = CalendarMonth.offsetMonth(now,option);
            System.out.println("==== CALENDAR APPLICATION =====");
            System.out.println();
            System.out.println("1. Show month - " + calendarMonth.getName()); //TODO
            System.out.println("2. Switch month {year month}"); //TODO
            System.out.println("3. Next month"); //todo
            System.out.println("4. Previous month"); //todo
            System.out.println("0. Exit");
            System.out.println();

            answer = scanner.nextInt();
            scanner.nextLine();

            switch(answer) {
                case 1:
                    showMonth(scanner, calendarMonth);
                    scanner.nextLine();
                    break;
                case 2:
                    int year = scanner.nextInt();
                    int month = scanner.nextInt();
                    calendarMonth = CalendarMonth.ofMonth(year, month);
                    scanner.nextLine();
                    break;
                case 3:
                    int currentMonth = calendarMonth.getMonth();
                    int nextYear = calendarMonth.getYear() + (currentMonth == 12 ? 1 : 0);
                    int nextMonth = currentMonth == 12 ? 1 : currentMonth + 1;
                    calendarMonth = CalendarMonth.ofMonth(nextYear, nextMonth);
                    scanner.nextLine();
                    break;
                case 4:
                    int actualMonth = calendarMonth.getMonth();
                    int previousYear = calendarMonth.getYear() + (actualMonth == 1 ? -1 : 0);
                    int previousMonth = actualMonth == 1 ? 12 : actualMonth - 1;
                    calendarMonth = CalendarMonth.ofMonth(previousYear, previousMonth);
                    scanner.nextLine();
                    break;
                    default:
                        System.out.println("Invalid command");
            }
        }while (answer != 0);

    }

    private static int switchMonth(Scanner scanner) {
        System.out.println("How many months you want to switch? ");
        int offset = scanner.nextInt();
        return offset;
    }

    private static void showMonth(Scanner scanner, CalendarMonth calendarMonth) {
        int option;
        do {
            System.out.println(calendarMonth);
            System.out.println("1. Add notes, 2. Show notes, 3. Remove notes");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    addNote(scanner, calendarMonth);
                    break;
                case 2:
                    showNote(scanner, calendarMonth);
                    scanner.nextLine();
                    scanner.nextLine();
                    break;
                case 3:
                    int dayNumber = scanner.nextInt();
                    calendarMonth.setNoteForDay(null, dayNumber);
                    break;
                default:
                    option = 0;
            }
        } while (option != 0);
    }

    private static void addNote(Scanner scanner, CalendarMonth calendarMonth) {
        int dayNumber = scanner.nextInt();
        String note = scanner.nextLine();
        calendarMonth.setNoteForDay(note, dayNumber);
    }

    private static void showNote(Scanner scanner, CalendarMonth calendarMonth) {
        int dayWithNoteNumber = scanner.nextInt();
        CalendarDay calendarDay = calendarMonth.getCalendarDay(dayWithNoteNumber);
        if(calendarDay.hasNote()) {
            System.out.println(calendarDay.getNotes());
        } else {
            System.out.println("No notes for this day...");
        }
    }

}
