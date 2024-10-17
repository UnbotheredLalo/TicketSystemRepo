package payment;

import ticket.Category;

public class Discounts {


    /**
     * This method returns the discount percentage and the total amount depending on the date,
     * and the category of the ticket.
     *
     * @param daysSinceIssue Days since the ticket was assigned
     * @param category Civil, Commercial, Traffic
     * @param fineAmount Monetary amount (not to be confused with UMA value)
     * @return Total fine amount
     */
    public double applyDiscounts(long daysSinceIssue, Category category, double fineAmount) {
        switch (category) {

            case CIVIL:
                if (daysSinceIssue <= 10) {
                    double percentage = (1 - Category.CIVIL.maxDiscount);
                    System.out.println("Tienes un descuento del " + percentage + "%. Total a pagar: ");
                    return fineAmount * percentage;

                } else if (daysSinceIssue <= 20) {
                    double percentage = (1 - Category.CIVIL.maxDiscount / 3);
                    System.out.println("Tienes un descuento del " + percentage + "%. Total a pagar: ");
                    return fineAmount * percentage;

                } else if (daysSinceIssue <= 30) {
                    System.out.println("Descuentos no disponibles. Total a pagar: ");
                    return fineAmount;
                } break;

            case COMMERCIAL:
                if (daysSinceIssue <= 10) {
                    double percentage = (1 - Category.COMMERCIAL.maxDiscount);
                    System.out.println("Tienes un descuento del " + percentage + "%. Total a pagar: ");
                    return fineAmount * percentage;

                } else if (daysSinceIssue <= 20) {
                    double percentage = (1 - Category.COMMERCIAL.maxDiscount / 3);
                    System.out.println("Tienes un descuento del " + percentage + "%. Total a pagar: ");
                    return fineAmount * percentage;

                } else if (daysSinceIssue <= 30) {
                    System.out.println("Descuentos no disponibles. Total a pagar: ");
                    return fineAmount;
                } break;

            case TRAFFIC:
                if (daysSinceIssue <= 10) {
                    double percentage = (1 - Category.TRAFFIC.maxDiscount);
                    System.out.println("Tienes un descuento del " + percentage + "%. Total a pagar: ");
                    return fineAmount * percentage;

                } else if (daysSinceIssue <= 20) {
                    double percentage = (1 - Category.TRAFFIC.maxDiscount / 3);
                    System.out.println("Tienes un descuento del " + percentage + "%. Total a pagar: ");
                    return fineAmount * percentage;

                } else if (daysSinceIssue <= 30) {
                    System.out.println("Descuentos no disponibles. Total a pagar: ");
                    return fineAmount;
                } break;

            default:
                throw new IllegalArgumentException("Categoría ingresada no válida: " + category);
        }

        throw new IllegalStateException("Días desde la emisión inválidos o categoría no manejada.");
    }
}
