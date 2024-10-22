package transit;

import ticket.Category;
import ticket.GovAuthorities;
import ticket.Ticket;
import offender.Offender;
import ticket.Type;

public class Transit extends Ticket {

    public static final Category TRAFFIC = Category.TRAFFIC ;

    public Transit(GovAuthorities authorityName, Offender offender, Type type) {

        super(authorityName, offender, type);
    }
}