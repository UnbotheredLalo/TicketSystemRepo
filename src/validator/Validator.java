package validator;

import java.time.LocalDate;

public class Validator {

    /**
     * Method can only receive a date that has already passed, no present date, unexistent dates nor
     * future dates are allowed in here, otherwise it will throw an exception.
     * @param inputDate
     */
    public static void validatePastDate(LocalDate inputDate) {
        LocalDate today = LocalDate.now();

        if (!inputDate.isBefore(today)) {
            throw new IllegalArgumentException("La fecha debe ser pasada. Fechas actuales o futuras no son válidas.");
        }

    }
}
