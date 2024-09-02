package org.example;

public enum DaysOfWeek {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Weekend"),
    SUNDAY("Weekend");


    private final String dayTitle;

    DaysOfWeek(String day) {
        this.dayTitle = day;
    }

    public String getDayTitle() {
        return this.dayTitle;
    }

    public static String weekendOrWorkday(DaysOfWeek day) {
        return day.getDayTitle();
    }

}
