package ru.itgirl;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        DayOfWeek day1 = DayOfWeek.valueOf(day);
        String translationOfDay = day1.getDayOfWeek();
        System.out.println(translationOfDay);
    }
}
