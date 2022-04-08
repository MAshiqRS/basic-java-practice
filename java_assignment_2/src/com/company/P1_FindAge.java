/*1. Find out the year, month and day between your birthday and today*/

package com.company;

import java.time.LocalDate;
import java.time.Period;

public class P1_FindAge {
    static void AgeCalculation() {
        LocalDate today = LocalDate.now();
        LocalDate dob = LocalDate.of(1998, 3, 24);
        Period age = Period.between(dob, today);
        System.out.println("I am " + age.getYears() + " Years " + age.getMonths() + " Months & " + age.getDays() + " days Old");
    }

    public static void main(String[] args) {
        AgeCalculation();
    }
}
