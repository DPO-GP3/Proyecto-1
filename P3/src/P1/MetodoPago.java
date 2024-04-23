package P1;



public class MetodoPago {
    private String comprador; 
    private String metodo; 

   
    public MetodoPago(String comprador, String metodo) {
        this.comprador = comprador;
        this.metodo = metodo;
    }


    public String getComprador() {
        return comprador;
    }

    public void setComprador(String comprador) {
        this.comprador = comprador;
    }

    
    public String getMetodo() {
        return metodo;
    }

    
    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }
}