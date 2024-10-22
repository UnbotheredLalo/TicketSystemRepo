package civil;

import offender.Offender;
import ticket.Category;
import ticket.GovAuthorities;
import ticket.Ticket;
import ticket.Type;

public class Civil extends Ticket {

    private final static Category CIVIL = Category.CIVIL;

    public Civil(GovAuthorities authorityName, Offender offender, Type type) {

        super(authorityName, offender, type);
    }
}