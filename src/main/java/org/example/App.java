package org.example;

import java.time.LocalDate;
import java.util.List;

public class App {
  public static void main(String[] args) {
    DateSorter dateSorter = new DateSorter();

    LocalDate testDate = LocalDate.of(2020, 1, 18);
    LocalDate testDate2 = LocalDate.of(2022, 2, 10);
    LocalDate testDate3 = LocalDate.of(2023, 3, 22);
    LocalDate testDate4 = LocalDate.of(2020, 4, 30);
    LocalDate testDate5 = LocalDate.of(2023, 8, 9);
    LocalDate testDate6 = LocalDate.of(2027, 1, 7);
    LocalDate testDate7 = LocalDate.of(2021, 2, 4);
    LocalDate testDate8 = LocalDate.of(2019, 5, 22);
    LocalDate testDate10 = LocalDate.of(2019, 5, 25);
    LocalDate testDate11 = LocalDate.of(2019, 5, 19);
    LocalDate testDate9 = LocalDate.of(2020, 3, 10);

    List<LocalDate> localDateList =
        List.of(
            testDate,
            testDate2,
            testDate3,
            testDate4,
            testDate5,
            testDate6,
            testDate7,
            testDate8,
            testDate9,
            testDate10,
            testDate11);

    System.out.println(dateSorter.sortDates(localDateList));
  }
}
