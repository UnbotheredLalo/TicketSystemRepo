package management;

import ticket.Ticket;

public interface TicketManagement {

    void setTicket(String fineID); // Crear o asignar una multa por su ID
    void addFineToList(String licensePlate); // Añadir multa a la lista vinculada a la placa
    void deleteFine(String fineID); // Eliminar multa por su ID
    Ticket searchTicketByLicense(String licensePlate); // Buscar multas asociadas a una placa
    double getDiscount(String dateInfo); // Calcular descuento en base a la fecha
    double calculateFine(); // Calcular monto de la multa
    String getGovAuthorityName(Ticket ticket); //Obtener el nombre de la autoridad que la impuso
    String getUMA(Ticket ticket); //Obtener el Valor UMA de la multa
    String getFineDescription(Ticket ticket); //Obtener descripción de la multa impuesta

}