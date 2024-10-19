package payment;

import datetimeutils.DateTimeUtils;
import ticket.Category;

import java.time.LocalDate;

public class ApplyDiscount implements Discount{


    public static LocalDate paymentDeadline = DateTimeUtils.issuedDate.plusDays(30);

    public static final int MAJOR_DISCOUNT  = 10;
    public static final int MINOR_DISCOUNT  = 20;
    public static final  int DEADLINE = 30;

    @Override
    public double applyDiscounts(long daysSinceIssue, Category category, double fineAmount) {

        if (daysSinceIssue <= MAJOR_DISCOUNT) {
            return applyMajorDiscount(fineAmount, category);

        } else if (daysSinceIssue <= MINOR_DISCOUNT) {
            return applyMinorDiscount(fineAmount, category);

        } else if (daysSinceIssue <= DEADLINE) {
            System.out.println("Descuentos no disponibles. Total a pagar: ");
            return fineAmount;
        } else {
            throw new IllegalArgumentException("Puede que tu fecha de pago se haya vencido." +
                    "Favor de verificar tu fecha límite de pago");
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
