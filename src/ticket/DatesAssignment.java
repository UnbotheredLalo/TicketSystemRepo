package ticket;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

import static validator.Validator.validatePastDate;

public class DatesAssignment {

    private static LocalDate pastIssuedDate;
    private static LocalDate issuedDate;
    private ZonedDateTime issuedDateTime;
    private LocalTime issuedHour;

    /**
     * This method allows to assign a past date if it wasnt assigned at the exact moment
     * @param date
     */
    public void assignDate(LocalDate date) { this.issuedDate = date; }

    /**
     * allows the User to enter a det in a format String with a "YYYY-MM-DD" format
     * @param parsedDate
     * @return a date with a format such as 2000-01-01
     */
    public static LocalDate stringDate(String parsedDate) {
        return LocalDate.parse(parsedDate);
    }

    /**
     * This method gets 3 integers for parameters, which stands for year, month and day
     * of a PAST DATE and past date only, and turns them into a date format
     * @param Year
     * @param Month
     * @param Day
     * @return Date Format "2000-01-01"
     */
    public static LocalDate assignPastDate(int Year, int Month, int Day) {
        pastIssuedDate = LocalDate.of(Year, Month, Day);
        validatePastDate(pastIssuedDate);
        return pastIssuedDate;
    }

    /**
     * This method  returns how many days are left for paying, Depending on how many days
     * have passed, you'll have the opportunity to get a discount when making an early payment
     * @param issuedDate
     * @return if the deadline has already passed, this method will return 0, otherwise,
     * it'll return the days left for paying without interests
     */
    public static long daysLeftDeadline(LocalDate issuedDate) {
        long daysPassed = ChronoUnit.DAYS.between(issuedDate, ZonedDateTime.now());
        return Math.max(30 - daysPassed, 0);
    }

    public static long daysSinceIssue() {
        return ChronoUnit.DAYS.between(issuedDate, ZonedDateTime.now());
    }

    public LocalTime getIssuedHour() {
        issuedHour = issuedDateTime.toLocalTime();
        return issuedHour;
    }

    public LocalDate getIssuedDate() {
        issuedDate = issuedDateTime.toLocalDate();
        return issuedDate;
    }

    public void assignCurrentDateTime() { this.issuedDateTime = ZonedDateTime.now(); }

    public ZonedDateTime getIssuedDateTime() { return issuedDateTime; }

}
