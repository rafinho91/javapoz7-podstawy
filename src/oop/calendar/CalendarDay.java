package oop.calendar;

public class CalendarDay {
// final to stala , bez final to zmienna
    private final int day;
    private final int month;
    private final int year;
    private String notes;


    public CalendarDay(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean hasNote(){
        return notes != null && !"".equals(notes);
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "CalendarDay{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                ", notes='" + notes + '\'' +
                '}';
    }
}
