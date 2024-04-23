package P1;

public class Pintura extends Pieza {
    
	private String color;
    private String tecnica;
    private String estilo;

    
    public Pintura(String ID, String tipo, String titulo, int anioCreacion, String autor, String dimensiones,
			String materialesDeConstruccion, float peso, boolean necesitaElectricidad, String otrosDetalles,
			String estado, String color, String tecnica, String estilo) {
		super(ID, tipo, titulo, anioCreacion, autor, dimensiones, materialesDeConstruccion, peso, necesitaElectricidad,
				otrosDetalles, estado);
		this.color = color;
        this.tecnica = tecnica;
        this.estilo = estilo;
	}

    
    @Override
    public void registrarPieza() {
        
        System.out.println("Registrando la pintura con ID: " + this.getID() + " y título: " + this.getTitulo());
        
    }

    @Override
    public void verificarEstado() {
        
        System.out.println("Verificando el estado de la pintura: " + this.getTitulo());
        
        this.setEstado("Verificado"); 
    }

    @Override
    protected void aprobar() {
        
        System.out.println("La pintura con ID: " + this.getID() + " ha sido aprobada.");
        
        this.setEstado("Aprobada");
    }

    @Override
    protected void rechazar() {
        
        System.out.println("La pintura con ID: " + this.getID() + " ha sido rechazada.");
        
        this.setEstado("Rechazada");
    }

    @Override
    public int getPrecio() {
        
        return 0; 
    }

  
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
}