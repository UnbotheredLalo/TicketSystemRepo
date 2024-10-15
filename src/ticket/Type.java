package ticket;

public enum Type {

    //Traffic Category
    CARECER_HOLOGRAMA(Category.TRAFFIC, "Carecer del holograma que contenga el número de placas", 1),
    PARABRISAS_ESTRELLADO(Category.TRAFFIC, "Tener el cristal de parabrisas estrellado", 3),
    SIN_TARJETA_CIRCULACIÓN(Category.TRAFFIC, "No presentar la tarjeta de circulación o " +
            "el pago del refrendo vehicular vigente", 2),
    PROHIBIDO_ESTACIONARSE(Category.TRAFFIC, "Estacionarse en zonas prohibidas", 5),
    NO_LICENCIA(Category.TRAFFIC, "No presentar la licencia o permiso de conducir vigente", 5),
    CRISTAL_POLARIZADO(Category.TRAFFIC, "Usar cristales polarizados", 3),
    VUELTA_PROHIBIDA(Category.TRAFFIC, "Dar vueltas prohibidas", 4),
    SIN_PLACA_CIRCULACION(Category.TRAFFIC, "No portar una placa de circulación", 4),
    PLACA_MAL_COLOCADA(Category.TRAFFIC, "Colocar las placas " +
            "en lugares distintos a los establecidos por la Ley", 1),
    SIN_CINTURON(Category.TRAFFIC, "Conducir sin usar el cinturón de seguridad", 5),
    MENOR_DE_EDAD_ADELANTE(Category.TRAFFIC, "Transportar a menores de 12 años en los asientos delanteros", 25),
    SIN_SEGURO_RESPONSABILIDAD(Category.TRAFFIC, "No contar con un seguro de responsabilidad civil por daños a terceros", 30),
    SIN_PLACAS(Category.TRAFFIC, "Circular sin placas o con placas vencidas", 200),

    //Civil Category
    NO_TRAMITE_REGISTRO(Category.CIVIL, "No realizar el tramite de rgeistro civil a tiempo (nacimiento o defunción", 20),
    FALTA_CITA_JUDICIAL(Category.CIVIL, "No asistir a una cita Judicial", 100),
    INCUMPLIMIENTO_SERVICIO(Category.CIVIL, "Negarse a cumplir con el servicio del jurado", 40),
    INCUMPLIMIENTO_ORDEN_CIVIL(Category.CIVIL, "Incimplir una orden de Protección Civil", 80),
    DAÑOS_MOBILIARIO_URBANO(Category.CIVIL, "Daños o alteración al Mobiliario Urbano", 150),
    CONSTRUCION_SIN_PERMISO(Category.CIVIL, "Construir sin ningun permiso en zonas no autorizadas", 500),
    INCUMPLIMIENTO_NORMAS_AMBIENTE(Category.CIVIL, "Incumplimiento de normas ambientales establecidas en la SEMARNAT", 500),
    ALTERACION_DOCUMENTOS(Category.CIVIL, "Alteración de documentos oficiales", 350),
    USO_INDEBIDO_PIROTECNIA(Category.CIVIL, "Uso indebido de pirotecnia", 50),
    PODA_PROPIEDAD_PRIV(Category.CIVIL, "Incumplimiento en la poda de arboles en propiedad privada", 150),

    //Commercial Category
    SIN_PERMISO_OPERACION(Category.COMMERCIAL, "No contar con un permiso de funcionamiento", 400),
    VENTA_PRODUCTOS_VENCIDOS(Category.COMMERCIAL, "Venta de productos en mal estado", 800),
    HORARIO_VENTA_ALCOHOL(Category.COMMERCIAL, "No respetar los horarios de venta d ealcohol", 1000),
    ETIQUETADO_DE_PRODUCTOS(Category.COMMERCIAL, "No respetar las normas de etiquetado de productos", 1500),
    FALTA_DE_COMPROBANTE(Category.COMMERCIAL, "Falta o no entrega de ticket, factura, o comprobante de compra", 300),
    PUBLICIDAD_ENGAÑOSA(Category.COMMERCIAL, "Realizar publicidad engañosa", 600),
    NO_RESPETA_PRECIOS(Category.COMMERCIAL, "No respetar precios anunciados en ofertas o promociones", 1500),
    ACCESIBILIDAD_DISCAPACITADOS(Category.COMMERCIAL, "Falta de accesibilidad para personas con discapacidad en establecimientos comerciales", 500),
    NEGARSE_A_DEVOLUCIONES(Category.COMMERCIAL, "Negarse a aceptar devoluciones de producots defectuosos  en mal estado", 1000),
    MEDIDAS_SANITARIAS(Category.COMMERCIAL, "Falta de medidas sanitarias en locales comerciales", 900);

    private final Category category;
    private final int valueUMA;
    private final String description;

    Type(Category category, String description, int valueUMA) {
        this.category = category;
        this.description = description;
        this.valueUMA = valueUMA;
    }

    public Category getCategory() { return category; }

    public double getValueUMA() { return valueUMA; }

    public String getDescription() { return description; }
}
