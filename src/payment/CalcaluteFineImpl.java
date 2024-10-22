package payment;

import ticket.Ticket;

public class CalcaluteFineImpl implements CalculateFine {

    private static final double UMA = 207.44;

    @ Override
    public double calculateFine(Ticket ticket) {
        return ticket.getType().getValueUMA() * UMA;
    }
}
