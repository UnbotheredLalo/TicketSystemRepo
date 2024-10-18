package payment;

import datetimeutils.DateTimeUtils;
import ticket.Category;

import java.sql.Time;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import ticket.DatesAssignment;

public class ApplyDiscount implements Discount{

    @Override
    public double applyDiscounts(long daysSinceIssue, Category category, double fineAmount) {

        if (daysSinceIssue <= Discount.MAJOR_DISCOUNT) {
            return applyMajorDiscount(fineAmount, category);

        } else if (daysSinceIssue <= Discount.MINOR_DISCOUNT) {
            return applyMinorDiscount(fineAmount, category);

        } else if (daysSinceIssue <= Discount.DEADLINE) {
            System.out.println("Descuentos no disponibles. Total a pagar: ");
            return fineAmount;

        } else {
            return Charges.calculateInterest(fineAmount,Charges.daysLate);
        }
    }

    private double applyMajorDiscount(double fineAmount, Category category) {
        double percentage = (1 - category.maxDiscount);
        System.out.println("Tienes un descuento del " + percentage * 100 + "%. Total a pagar: ");
        return fineAmount * percentage;
    }

    private double applyMinorDiscount(double fineAmount,Category category) {
        double percentage = (1 - category.maxDiscount / 3);
        System.out.println("Tienes un descuento del " + percentage * 100 + "%. Total a pagar: ");
        return fineAmount * percentage;
    }
}
