package payment;

import ticket.Ticket;

public class PayFine {

    public void markAsPaid(Ticket ticket) {
        if (ticket.getIsPaid()) {
            ticket.setAsPaid();
            System.out.println("Multa pagada");

        } else {
            throw new IllegalArgumentException("Esta muLta ya ha sido pagada");
        }
    }
}