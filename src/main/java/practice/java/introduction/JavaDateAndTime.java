/*
  Method findDay returns the day on that date.
 */
package practice.java.introduction;

import java.time.LocalDate;

public class JavaDateAndTime {

    public static void findDay(int month, int day, int year) {
        LocalDate localDate = LocalDate.of(year, month, day);
        System.out.println(localDate.getDayOfWeek());
    }

    public static void main(String[] args) {
        findDay(11,03,2019);
    }
}
