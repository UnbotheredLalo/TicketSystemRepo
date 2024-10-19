package transit;

import ticket.Category;
import ticket.GovAuthorities;
import ticket.Ticket;

public class Transit extends Ticket {

    public Category trafficType = Category.TRAFFIC ;

    public Transit(Category trafficType,
                   GovAuthorities authorityName) {
        super(authorityName);
        this.trafficType = trafficType;
    }
}