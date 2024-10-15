package ticket;

public enum GovAuthorities {

    //Traffic Authorities
    SEMOVI(Category.TRAFFIC, "Secretaria de Movilidad"),
    DIRECCION_TRAFICO_MUNICIPAL(Category.TRAFFIC, "Dirección de Tráfico Municipal"),
    GUARDIA_NACIONAL(Category.TRAFFIC, "Guardia Nacional"),
    POLICIA_MUNICIPAL(Category.TRAFFIC, "Policia Municipal"),

    //Commercial_Authorities
    PROFECO(Category.COMMERCIAL, "Procuraduría Federal del Consumidor"),
    SECRETARIA_DE_SALUD(Category.COMMERCIAL, "Secretaria de Salud"),
    SAT(Category.COMMERCIAL, "Servicio de Administración Tributaria"),
    COFEPRIS(Category.COMMERCIAL, "Comisión Federal para la Protección contra Riesgos Sanitarios"),
    CFE(Category.COMMERCIAL, "Comisión Federal de Electricidad"),

    //Civil Authorities
    PROFEPA(Category.CIVIL, "Procuraduría Federal de Portección al Ambiente"),
    CONAGUA(Category.CIVIL, "Comisión Nacional del Agua"),
    SEMARNAT(Category.CIVIL, "Secretaría de Medio Ambiente y Recursos Naturales"),
    IMSS(Category.CIVIL, "Instituto Mexicano del Seguro Social");

    private final Category category;
    private final String authorityName;

    GovAuthorities(Category category, String authorityName) {
        this.category = category;
        this.authorityName = authorityName;
    }

    public Category getCategory() { return category; }

    public String getAuthorityName() { return authorityName; }

}
