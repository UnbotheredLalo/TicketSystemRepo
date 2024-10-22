package commercial;

import ticket.Category;
import ticket.GovAuthorities;
import ticket.Ticket;
import ticket.Type;
import offender.Offender;

public class Commercial extends Ticket {

    private static final Category COMMERCIAL = Category.COMMERCIAL;

    public Commercial(GovAuthorities authorityName, Offender offender, Type type) {

        super(authorityName, offender, type);
    }
}