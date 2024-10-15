package commercial;

import datetimeutils.DateTimeUtils;
import ticket.Category;
import ticket.GovAuthorities;
import ticket.Ticket;

public class Commercial extends Ticket {

    private Category commercialType = Category.COMMERCIAL;
    private static final int MINIMUM_FINE_COMMERCIAL = 400;
    private static final double MAX_DISCOUNT_COMMERCIAL = 0.20;

    public Commercial(Category commercialType, GovAuthorities authorityName) {
        super(authorityName);
        this.commercialType = commercialType;
    }
}