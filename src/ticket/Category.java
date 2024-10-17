package ticket;

public enum Category {

    COMMERCIAL("Multa Comercial", 400, 0.20 ),
    CIVIL("Multa Civil", 20, 0.30),
    TRAFFIC("Multa de Transito", 1, 0.50);

    public final String fineType;
    public final int minimumFine;
    public final double maxDiscount;

    Category(String fineType, int minimumUMA, double maxDiscount) {
        this.fineType = fineType;
        this.minimumFine = minimumUMA;
        this.maxDiscount = maxDiscount;

    }

    public String getFineType() { return fineType; }
}
