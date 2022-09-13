/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

/*
 * The Java 8 Date/Time API consists of package java.time and its subpackages.
 * We will cover packages and imports in Session 7.
 * For the purposes of this lab, we give you a few wildcarded imports,
 * so you can use the classes in these packages without having to worry about importing them.
 */

import java.time.*;
import java.time.format.*;

class DateTimeTest {


  /**
   * main() calls each of the test methods in turn (currently commented out). To run one test method
   * at a time, uncomment the call to the one you want to execute.
   */
  public static void main(String[] args) {
    testNow();
    testCreate();
    testParse();
    testFormat();
  }

  /**
   * TASK: create current date, time, and date-time via now() and then print them.
   */
  public static void testNow() {
    // TODO
    LocalDateTime dateTime = LocalDateTime.now();
    System.out.println(dateTime);

    LocalDate date = LocalDate.now();
    System.out.println(date);

    LocalTime time = LocalTime.now();
    System.out.println(time);
  }

  /**
   * TASK: implement the TODOs and print your results.
   */
  public static void testCreate() {
    // TODO: create your birthday via of(). What day of the week were you born on?
    LocalDate bday = LocalDate.of(1985, 2, 18);
    System.out.println(bday);

    DayOfWeek day = DayOfWeek.FRIDAY;
    System.out.println(day);

    // TODO: use of() to create a value representing the 1st lunar landing - it happened on 7/20/69 at 3:18pm Eastern Time.
    // NOTE: ignore time-zone, just assume Eastern Time is the local time.
    LocalDateTime lunarLanding = LocalDateTime.of(1969, 7, 20, 15, 38);
    System.out.println(lunarLanding);
  }

  /**
   * TASK: implement the TODOs and print your results.
   */
  public static void testParse() {
    // TODO: create your birthday by parsing a text representation in standard format ("yyyy-MM-dd").
    LocalDate bday = LocalDate.parse("1985-02-18");
    System.out.println(bday);

    // OPTIONAL: now create it by parsing text in the form "2/6/2014" (this is Feb 6, not Jun 2).
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");
    bday = LocalDate.parse("02/18/1985", formatter);
    System.out.println(bday);
  }

  /**
   * TASK: create formatted display strings for the date below, in the specified formats.
   */
  public static void testFormat() {
    LocalDate hastings = LocalDate.of(1066, 10, 14);

    // TODO: 10/14/1066
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");
    System.out.println(formatter.format(hastings));

    // TODO: 14-10-1066
    DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-M-yyyy");
    System.out.println(formatter1.format(hastings));

    // OPTIONAL: October 14, 1066
    DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
    System.out.println(formatter2.format(hastings));
  }
}