package payment;

import datetimeutils.DateTimeUtils;
import ticket.Category;
import ticket.DatesAssignment;

import java.time.LocalDate;

public interface Discount {

    LocalDate paymentDeadline = DatesAssignment.issuedDate.plusDays(30);

    int MAJOR_DISCOUNT  = 10;
    int MINOR_DISCOUNT  = 20;
    int DEADLINE = 30;

    /**
     * This method returns the discount percentage and the total amount depending on the date,
     * and the category of the ticket.
     *
     * @param daysSinceIssue Days since the ticket was assigned
     * @param category Civil, Commercial, Traffic
     * @param fineAmount Monetary amount (not to be confused with UMA value)
     * @return Total fine amount
     */
    public double applyDiscounts(long daysSinceIssue, Category category, double fineAmount);

}
