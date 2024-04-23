package P1;

public class Fotografia extends Pieza {

    private String resolucion;
    private String tipoDeColor;

    
    public Fotografia(String ID, String tipo, String titulo, int anioCreacion, String autor, String dimensiones,
                      String materialesDeConstruccion, float peso, boolean necesitaElectricidad,
                      String otrosDetalles, String estado, String resolucion, String tipoDeColor) {
        super(ID, tipo, titulo, anioCreacion, autor, dimensiones, materialesDeConstruccion, peso,
              necesitaElectricidad, otrosDetalles, estado);
        this.resolucion = resolucion;
        this.tipoDeColor = tipoDeColor;
    }

    @Override
    public void registrarPieza() {
        
        System.out.println("Registrando fotografía: " + this.getTitulo());
        
    }

    @Override
    public void verificarEstado() {
        
        if (this.getResolucion().equals("Alta")) {
            this.setEstado("Verificado");
            System.out.println("Estado de la fotografía " + this.getTitulo() + " verificado y es aceptable.");
        } else {
            this.setEstado("Requiere revisión");
            System.out.println("La fotografía " + this.getTitulo() + " requiere revisión para verificación.");
        }
    }

    @Override
    protected void aprobar() {
        
        if (this.getEstado().equals("Verificado")) {
            this.setEstado("Aprobada");
            System.out.println("Aprobando fotografía: " + this.getTitulo() + ". Ahora está disponible para exposición o venta.");
        } else {
            System.out.println("La fotografía: " + this.getTitulo() + " no puede ser aprobada porque aún no ha sido verificada.");
        }
    }

    @Override
    protected void rechazar() {
       
        this.setEstado("Rechazada");
        System.out.println("Rechazando fotografía: " + this.getTitulo() + ". No está disponible para exposición ni venta.");
    }

    @Override
    public int getPrecio() {
       
        return calcularPrecio();
    }

    

  
    private int calcularPrecio() {
        int basePrice = 50; // 
        int resolucionBonus = this.getResolucion().equals("Alta") ? 20 : 0;
        int colorBonus = this.getTipoDeColor().equals("Color") ? 30 : 10;
        
        return basePrice + resolucionBonus + colorBonus; 
    }

  
    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public String getTipoDeColor() {
        return tipoDeColor;
    }

    public void setTipoDeColor(String tipoDeColor) {
        this.tipoDeColor = tipoDeColor;
    }
}