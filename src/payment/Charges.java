package payment;

import ticket.DatesAssignment;

import java.time.temporal.ChronoUnit;

public class Charges {

    public static long daysLate = ChronoUnit.DAYS.between(Discount.paymentDeadline, DatesAssignment.currentDate);


    public static double calculateInterest(double fineAmount, long daysLate) {
        if (daysLate <= Discount.DEADLINE) {
        double interestRate = 0.05;
        return fineAmount * Math.pow(1 + interestRate, daysLate);
        }
        throw new IllegalArgumentException("No hay cargos por aplicar. Plazo para pagar aun no vencido");
    }
}
