package P1;

public class Video extends Pieza {

    private String duracion;  
    private String resolucion;  

    
    public Video(String ID, String tipo, String titulo, int anioCreacion, String autor, String dimensiones,
                 String materialesDeConstruccion, float peso, boolean necesitaElectricidad, String otrosDetalles,
                 String estado, String duracion, String resolucion) {
        super(ID, tipo, titulo, anioCreacion, autor, dimensiones, materialesDeConstruccion, peso,
              necesitaElectricidad, otrosDetalles, estado);
        this.duracion = duracion;
        this.resolucion = resolucion;
    }

    @Override
    public void registrarPieza() {
        
        System.out.println("Registrando video: " + this.getTitulo() + " en la base de datos.");
       
    }

    @Override
    public void verificarEstado() {
       
        System.out.println("Verificando el estado de calidad del video: " + this.getTitulo());
        this.setEstado("Verificado");  
    }

    @Override
    protected void aprobar() {
        
        System.out.println("Aprobando el video: " + this.getTitulo());
        this.setEstado("Aprobada");  
    }

    @Override
    protected void rechazar() {
        
        System.out.println("Rechazando el video: " + this.getTitulo());
        this.setEstado("Rechazada");  
    }

    @Override
    public int getPrecio() {
        
        return calcularPrecio();
    }

    private int calcularPrecio() {
       
        int basePrice = 100;
        int duracionBonus = Integer.parseInt(duracion.split(" ")[0]) > 60 ? 50 : 20;  
        int resolutionBonus = resolucion.equals("1920x1080") ? 50 : 10;  
        return basePrice + duracionBonus + resolutionBonus;
    }

    
    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }
}