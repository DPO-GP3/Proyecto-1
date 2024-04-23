package P1;

public class Oferta {
    private Comprador comprador;
    private double monto;

  
    public Oferta(Comprador comprador, double monto) {
        this.comprador = comprador;
        this.monto = monto;
    }
 
    public Comprador getComprador() {
        return comprador;
    }

    public double getMonto() {
        return monto;
    }

  
}