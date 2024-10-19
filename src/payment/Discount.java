package payment;

import ticket.Category;

public interface Discount {

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
