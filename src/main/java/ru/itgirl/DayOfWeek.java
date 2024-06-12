package ru.itgirl;

public enum DayOfWeek {
    Sunday("Воскресенье"), Monday("Понедельник"), Tuesday("Вторник"),
    Wednesday("Среда"), Thursday("Четверг"), Friday("Пятница"),
    Saturday("Суббота");

    String translation;

    DayOfWeek() {
    }

    DayOfWeek(String translation) {
        this.translation = translation;
    }

    public String getDayOfWeek() {
        return translation;
    }
}
