package ticket;

import java.util.Random;

public class IDGenerator {

    public static long generateTicketID() {
        Random randomID = new Random();
        return 100_000_000L + randomID.nextInt(900_000_000);
    }
}
