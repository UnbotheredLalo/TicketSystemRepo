package ticket;

import datetimeutils.DateTimeUtils;

public class Ticket {

    public long fineID;
    private final GovAuthorities authorityName;
    public DateTimeUtils issueDate;
    public Boolean isPaid;
    public double fine;
    private static final double UMA = 207.44;

    public Ticket(long fineID, DateTimeUtils issueDate, GovAuthorities authorityName, Boolean isPaid) {
        this.fineID = fineID;
        this.issueDate = issueDate;
        this.authorityName = authorityName;
        this.isPaid = isPaid;
    }

    public String showDetails() {
        String ticketInfo = "Date: " + issueDate + "\n"
                + "Your Fine ID is: " + fineID + "\n"
                + "Authority: " + authorityName + "\n"
                + "Status: " + isPaid;
        return ticketInfo;
    }
}
