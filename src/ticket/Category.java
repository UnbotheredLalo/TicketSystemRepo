package ticket;

public enum Category {

    COMMERCIAL("Multa Comercial"),
    CIVIL("Multa Civil"),
    TRAFFIC("Multa de Transito");

    public final String fineType;

    Category(String fineType) {
        this.fineType = fineType;
    }

    public String getFineType() { return fineType; }
}
