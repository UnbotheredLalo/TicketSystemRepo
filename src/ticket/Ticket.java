package ticket;

import datetimeutils.DateTimeUtils;
import java.time.ZonedDateTime;

public class Ticket {

    private long fineID;
    private final GovAuthorities authorityName;
    private ZonedDateTime issueDate;
    private Boolean isPaid;
    private double fine;
    private static final double UMA = 207.44;

    public Ticket(GovAuthorities authorityName) {
        this.fineID = IDGenerator.generateTicketID();
        this.issueDate = DateTimeUtils.getCurrentZonedDateTime();
        this.authorityName = authorityName;
        this.isPaid = false;
    }

    public String showDetails() {
        String ticketInfo = "Date: " + issueDate + "\n"
                + "Your Fine ID is: " + fineID + "\n"
                + "Authority: " + authorityName + "\n"
                + "Status: " + isPaid;
        return ticketInfo;
    }
}
