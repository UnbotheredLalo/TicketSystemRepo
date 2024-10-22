package management;

import ticket.Category;
import ticket.Ticket;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public interface TicketManagement {

    double processTicket(Ticket ticket);
    Map<Category, ArrayList<Ticket>> groupByCategory(ArrayList<Ticket> tickets);
    List<Ticket> sortByCategory(ArrayList<Ticket> tickets);
    List<Ticket> sortByDate(ArrayList<Ticket> tickets);
    List<Ticket> removePaid(ArrayList<Ticket> tickets);
    List<Ticket> filterPaid(ArrayList<Ticket> tickets);
    List<Ticket> filterUnpaid(ArrayList<Ticket> tickets);
    List<Ticket> filterByUMAValue(ArrayList<Ticket> tickets);

    /* TODO. Ver una manera de agregar estos metodos a la clase de TicketServie
    /**
    * This method adds a newly created fine to the list once it was assigned to the
    * offender by linking it with his/her/its license plate/CURP/NRP.

    * @param offenderKey, the key which the offender gets identified with,
    * such as CURP (natural person), NRP (Legal entity) or the license plates
    * of the offender's car

    void addFineToList(String offenderKey);
     */
}