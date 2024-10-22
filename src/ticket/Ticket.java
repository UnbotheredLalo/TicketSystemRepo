package ticket;

import datetimeutils.DateTimeUtils;
import offender.Offender;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;


public class Ticket {

    private long fineID;
    private ArrayList<Ticket> tickets;
    private final GovAuthorities authorityName;
    private final Type type;
    private final String description;
    private LocalDateTime issueDate;
    private double fineAmount;
    private Offender offender;
    private Boolean isPaid;

    public Ticket(GovAuthorities authorityName, Offender offender, Type type) {
        this.fineID = IDGenerator.generateTicketID();
        this.issueDate = DateTimeUtils.getCurrentZonedDateTime().toLocalDateTime();
        this.authorityName = authorityName;
        this.description = getType().getDescription();
        this.offender = offender;
        this.type = type;
        this.isPaid = false;
        addTicket(this);
    }

    public String showDetails() {
        String ticketInfo = "Fecha: " + issueDate + "\n"
                + "ID dde la multa: " + fineID + "\n"
                + type.getCategory().getFineType() + "\n"
                + "Autoridad: " + authorityName + "\n"
                + "Razón de la multa: " + description + "\n"
                + "Status: " + isPaid;
        return ticketInfo;
    }

    public void setAsPaid() {
        if (!this.isPaid) {
            this.isPaid = true;
            System.out.println("Multa pagada");
        } else throw new IllegalArgumentException("Esta multa ya ha sido pagada");
    }

    public void addTicket(Ticket ticket) { this.tickets.add(ticket); }

    public ArrayList<Ticket> getTickets() { return tickets; }

    public Type getType() { return type; }

    public Boolean getIsPaid() { return isPaid; }

    public LocalDateTime getIssueDate() { return issueDate; }

    public Category getCategory() { return type.getCategory(); }

    public int getUMAValue() { return type.valueUMA;}

    public LocalTime getIssuedHour() { return issueDate.toLocalTime(); }

    public Offender getOffender() { return offender; }

    public GovAuthorities getAuthorityName() { return authorityName; }

}
