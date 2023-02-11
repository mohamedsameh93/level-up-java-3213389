package com.linkedin.javacodechallenges;

import java.time.LocalDate;

import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class App {
    public static LocalDate calculateHundredDaysFromNow(LocalDate today) {
        return today.plus(100, ChronoUnit.DAYS);
    }

    public static void main(String[] args) {
        LocalDate today = LocalDate.now(ZoneId.of("America/New_York"));
        System.out.println("100 days from now is... " +
                calculateHundredDaysFromNow(today));
    }
}
