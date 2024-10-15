package management;

import ticket.Ticket;

import java.time.ZonedDateTime;

public interface TicketManagement {

    Ticket searchTicketByLicense(String licensePlate);
    double calculateFine();
    String getGovAuthorityName(Ticket ticket);
    String getUMA(Ticket ticket);
    String getFineDescription(Ticket ticket);
    void deleteFine(long fineID);
    void setTicket(long fineID);
    /*
    * This assigns a Ticket by assigning an ID manually; whether you use this method
    or the constructor given on 'Ticket' class, you'll be creating a Ticket object
    with a unique ID. This method throws an exception if the entered ID is repeated.

    * @params fineID, the fine ID is manually entered instead of being randomly generated.
     */

    void addFineToList(String offenderKey);
    /*
    * This method adds a newly created fine to the list once it was assigned to the
    offender by linking it with his/her/its license plate/CURP/NRP.

    * @params offenderKey, the key which the offender gets identified with,
    such as CURP (natural person), NRP (Legal entity) or the license plates
    of the offender's car
    */

    double getDiscount(ZonedDateTime issueDate);
    /*
    Gets the amount of the fine with the discount applied based on the fine's
    date application.
    It varies depending on the type of fine
    */

}