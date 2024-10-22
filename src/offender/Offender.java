package offender;

import ticket.IDGenerator;
import ticket.Ticket;

import java.util.Optional;

public class Offender {
    private String name;
    private String licenseNumber;
    private long id;

    public Offender(String name, String licenseNumber) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.id = IDGenerator.generateTicketID();
    }

    public String getName() { return "Infractor: " + name; }

    public String getLicenseNumber() { return "N° of License: " + licenseNumber; }

    public long getId() { return  id; }
}
