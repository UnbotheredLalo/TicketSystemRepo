package commercial;

import ticket.Category;
import ticket.GovAuthorities;
import ticket.Ticket;

public class Commercial extends Ticket {

    private Category commercialType = Category.COMMERCIAL;

    public Commercial(Category commercialType, GovAuthorities authorityName) {
        super(authorityName);
        this.commercialType = commercialType;
    }
}