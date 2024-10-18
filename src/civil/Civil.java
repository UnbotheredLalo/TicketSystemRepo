package civil;

import payment.Discount;
import ticket.Category;
import ticket.GovAuthorities;
import ticket.Ticket;

public class Civil extends Ticket implements Discount {

    private Category civilType = Category.CIVIL;

    public Civil(Category civilType, GovAuthorities authorityName) {
        super(authorityName);
        this.civilType = civilType;
    }

    @Override
    public double applyDiscounts(long daysSinceIssue, Category category, double fineAmount) {

        if (daysSinceIssue <= Discount.MAJOR_DISCOUNT) {
            double percentage = (1 - Category.CIVIL.maxDiscount);
            System.out.println("Tienes un descuento del " + percentage + "%. Total a pagar: ");
            return fineAmount * percentage;

        } else if (daysSinceIssue <= Discount.MINOR_DISCOUNT) {
            double percentage = (1 - Category.CIVIL.maxDiscount / 3);
            System.out.println("Tienes un descuento del " + percentage + "%. Total a pagar: ");
            return fineAmount * percentage;

        } else if (daysSinceIssue <= Discount.DEADLINE) {
            System.out.println("Descuentos no disponibles. Total a pagar: ");
            return fineAmount;
        }
        throw new IllegalStateException("Días desde la emisión inválidos o categoría no manejada.");
    }
}