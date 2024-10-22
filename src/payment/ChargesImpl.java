package payment;

public class ChargesImpl implements Charges {

    private static final double INTEREST_RATE = 1.05;

    @Override
    public double calculateInterest(double fineAmount, long daysLate) {
        if (daysLate <= ApplyDiscount.DEADLINE) {
            return fineAmount * Math.pow(INTEREST_RATE, daysLate);
        }

        throw new IllegalArgumentException("No hay cargos por aplicar. Plazo para pagar aun no vencido");
    }
}
