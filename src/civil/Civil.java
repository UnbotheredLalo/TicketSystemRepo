package civil;

import ticket.Category;
import ticket.GovAuthorities;
import ticket.Ticket;

public class Civil extends Ticket {

    public Category civilType = Category.CIVIL ;
    private static final int MINIMUM_FINE_CIVIL = 20;
    private static final double MAX_DISCOUNT_CIVIL = 0.30;

    public Civil(Category civilType, GovAuthorities authorityName) {
        super(authorityName);
        this.civilType = civilType;
    }
}