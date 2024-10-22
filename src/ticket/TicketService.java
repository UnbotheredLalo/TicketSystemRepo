package ticket;

import management.TicketManagement;
import payment.CalcaluteFineImpl;

import java.util.*;
import java.util.stream.Collectors;

public class TicketService implements TicketManagement {

    private final CalcaluteFineImpl calculateFine;

    public TicketService(CalcaluteFineImpl calculateFine) {
        this.calculateFine = calculateFine;
    }

    public double processTicket(Ticket ticket) {
        return calculateFine.calculateFine(ticket);
    }

    public List<Ticket> sortByCategory(ArrayList<Ticket> tickets) {
        return (ArrayList<Ticket>) tickets.stream()
                .sorted(Comparator.comparing(Ticket::getCategory))
                .collect(Collectors.toList());
    }

    public Map<Category, ArrayList<Ticket>> groupByCategory(ArrayList<Ticket> tickets) {
        return tickets.stream()
                .collect(Collectors.groupingBy(
                        Ticket::getCategory,
                        Collectors.toCollection(ArrayList::new)
                ));
    }

    public List<Ticket> sortByDate(ArrayList<Ticket> tickets) {
        return (ArrayList<Ticket>) tickets.stream()
                .sorted(Comparator.comparing(Ticket::getIssueDate).reversed())
                .collect(Collectors.toList());
    }

    public List<Ticket> filterPaid(ArrayList<Ticket> tickets) {
        return (ArrayList<Ticket>) tickets.stream()
                .filter(Ticket::getIsPaid)
                .collect(Collectors.toList());
    }

    public List<Ticket> removePaid(ArrayList<Ticket> tickets) {
        List<Ticket> paidTickets = tickets.stream()
                .filter(Ticket::getIsPaid)
                .toList();
        tickets.removeIf(ticket -> !ticket.getIsPaid());
        return paidTickets;
    }

    public List<Ticket> filterUnpaid(ArrayList<Ticket> tickets) {
        return (ArrayList<Ticket>) tickets.stream()
                .filter(ticket -> !ticket.getIsPaid())
                .collect(Collectors.toList());
    }


    public List<Ticket> filterByUMAValue(ArrayList<Ticket> tickets) {
        return (ArrayList<Ticket>) tickets.stream()
                .sorted(Comparator.comparingInt(Ticket::getUMAValue).reversed())
                .collect(Collectors.toList());
    }
}
