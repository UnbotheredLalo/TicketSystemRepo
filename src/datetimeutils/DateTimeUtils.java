package datetimeutils;

import ticket.Ticket;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateTimeUtils {

    private static final ZoneId UTC = ZoneId.of("UTC");

    public static ZonedDateTime getCurrentZonedDateTime() {
        return ZonedDateTime.now(UTC);
    }

    public static ZonedDateTime convertDateToZonedDateTime(Date date) {
        return date.toInstant().atZone(UTC);
    }

    public static Date convertZonedDateTimeToDate(ZonedDateTime zonedDateTime) {
        return Date.from(zonedDateTime.toInstant());
    }

    public static ZonedDateTime currentZonedDateTimePlusMinutes(int minutes) {
        final ZonedDateTime currentDateTime = getCurrentZonedDateTime();

        return currentDateTime.plusMinutes(minutes);
    }

    public static String getCurrentDateTimeString() {
        final ZonedDateTime mexicoCityDateTime = getCurrentZonedDateTime();
        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");

        return mexicoCityDateTime.format(formatter);
    }

    /**
     * allows the User to enter a det in a format String with a "YYYY-MM-DD" format
     * @param parsedDate
     * @return a date with a format such as 2000-01-01
     */
    public static LocalDate stringDate(String parsedDate) {
        return LocalDate.parse(parsedDate);
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

    /**
     * Method shows how many days have passed since the imposed ticket and the actual date
     * @return
     */
    public static long countDaysSinceIssue(Ticket ticket) {
        return ChronoUnit.DAYS.between(ticket.getIssueDate(), ZonedDateTime.now());
    }

    public LocalTime getIssuedHour() {
        issuedHour = issuedDateTime.toLocalTime();
        return issuedHour;
    }

    public LocalDate getIssuedDate() {
        issuedDate = issuedDateTime.toLocalDate();
        return issuedDate;
    }

    public ZonedDateTime getIssuedDateTime() { return issuedDateTime; }
}
