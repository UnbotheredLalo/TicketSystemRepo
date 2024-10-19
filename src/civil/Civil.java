package civil;

import ticket.Category;
import ticket.GovAuthorities;
import ticket.Ticket;

public class Civil extends Ticket {

    private Category civilType = Category.CIVIL;

    public Civil(Category civilType, GovAuthorities authorityName) {
        super(authorityName);
        this.civilType = civilType;
    }
}