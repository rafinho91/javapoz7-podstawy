package oop.calendar;

import java.util.Arrays;

// fabryka/ metoda fabrykujaca - statyczna metoda w danej klasie
// LocalDate klasa

public class CalendarMonth {
    // static nie wywolujemy na rzecz obiektu tylko na rzecz klasy, jest dla kazdego obiektudanej klasy taka sama
    private static final char[] weekDaysShortcuts = {'M', 'T', 'W', 'T', 'F', 'S', 'S'};

    private final String name;
    private CalendarDay[] days;
    private int startingWeekDay;
    // metoda fabrykujaca
    public static CalendarMonth of(String name, int year, int month, int numberOfDays, int startingWeekDay) {
        CalendarMonth calendarMonth = new CalendarMonth(name);
        calendarMonth.startingWeekDay = startingWeekDay;
        calendarMonth.days = createCalendarDays(year, month, numberOfDays);
        return  calendarMonth;
    }

    private static CalendarDay[] createCalendarDays(int year, int month, int numberOfDays) {
        CalendarDay[] days = new CalendarDay[numberOfDays];
        for (int i = 0; i < numberOfDays; i++) {
            days[i] = new CalendarDay(i+1, month, year);
        }
        return days;
    }

    public CalendarMonth(String name) {
        this.name = name;
    }

    public CalendarMonth(String name, CalendarDay[] days, int startingWeekDay) {
        this.name = name;
        this.days = days;
        this.startingWeekDay = startingWeekDay;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(name.toUpperCase()).append("\n");
        appendHorizontalLine(builder);
        for (int i = 0; i < weekDaysShortcuts.length; i++) {
            builder.append(weekDaysShortcuts[i]).append("   ");
        }
        builder.append("\n");
        appendHorizontalLine(builder);

        for (int i = 0; i < startingWeekDay-1; i++) {
            builder.append("    ");
        }
        for (int i = 0; i < days.length; i++) {
            if ((i + startingWeekDay - 1) % 7 == 0){
                builder.append("\n");
            }
            builder.append(createCalendarDayElement(days[i]));
        }
        builder.append("\n");
        appendHorizontalLine(builder);
        return builder.toString();
    }

    private void appendHorizontalLine(StringBuilder builder) {
        for (int i = 0; i < 7 * 4; i++) {
            builder.append("-");
        }
        builder.append("\n");
    }

    private  String createCalendarDayElement(CalendarDay calendarDay) {
        String calendarDayRepresentation = "" + calendarDay.getDay();
        calendarDayRepresentation += calendarDay.hasNote() ? "*" : " ";
        calendarDayRepresentation += calendarDay.getDay() >= 10 ? " " : "  ";
        return calendarDayRepresentation;
    }

    public String getName() {
        return name;
    }

    public CalendarDay[] getDays() {
        return days;
    }

    public void setDays(CalendarDay[] days) {
        this.days = days;
    }

    public int getStartingWeekDay() {
        return startingWeekDay;
    }

    public void setStartingWeekDay(int startingWeekDay) {
        this.startingWeekDay = startingWeekDay;
    }

    public void setNoteForDay(String note, int dayNumber) {
        days[dayNumber-1].setNotes(note);
    }
}
