package pl.sda;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What year?");
        int year = sc.nextInt();
        System.out.println("What month?");
        int month = sc.nextInt();
        System.out.println("What day?");
        int day = sc.nextInt();

        LocalDate now = LocalDate.now();
        LocalDate entered = LocalDate.of(year, month, day);

        System.out.println("Years:" + ChronoUnit.YEARS.between(entered, now));
        System.out.println("Months:" + ChronoUnit.MONTHS.between(entered, now));
        System.out.println("Days:" + ChronoUnit.DAYS.between(entered, now));

    }
}
