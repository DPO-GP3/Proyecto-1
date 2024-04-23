package P1;

import java.util.ArrayList;
import java.util.List;

public class Comprador {
    private String nombre;
    private double limiteCompra;
    private double saldo;
    private List<Oferta> ofertasRealizadas; 
    

    public Comprador(String nombre, double limiteCompra, double saldoInicial) {
        this.nombre = nombre;
        this.limiteCompra = limiteCompra;
        this.saldo = saldoInicial;
        this.ofertasRealizadas = new ArrayList<>();
    }

    public void realizarCompra(List<Pieza> piezas) {
        for (Pieza pieza : piezas) {
            if (this.saldo >= pieza.getPrecio()) {
                this.saldo -= pieza.getPrecio(); 
                System.out.println("Compra realizada: " + pieza.getTitulo());
            } else {
                System.out.println("Fondos insuficientes para comprar: " + pieza.getTitulo());
            }
        }
    }

    public void realizarCompra(Pieza pieza) {
        double precio = pieza.getPrecio(); 
        if (precio <= saldo) {
            saldo -= precio; 
            System.out.println("Compra realizada con éxito: " + pieza);
        } else {
            System.out.println("Saldo insuficiente para realizar la compra.");
        }
    }
    
    public void realizarOferta(Subasta subasta, double monto) {
        

        if (monto <= limiteCompra && monto <= saldo) {
            Oferta nuevaOferta = new Oferta(this, monto); 
            ofertasRealizadas.add(nuevaOferta);
            subasta.registrarOferta(this, monto); 
            System.out.println("Oferta realizada por el comprador: " + monto);
        } else {
            System.out.println("La oferta supera el límite de compra o el saldo.");
        }
    }

    public String getNombre() {
        return nombre;
    }

    
    public double getLimiteCompra() {
        return limiteCompra;
    }

    public void setLimiteCompra(double limiteCompra) {
        this.limiteCompra = limiteCompra;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

  
    public List<Oferta> getOfertasRealizadas() {
        return ofertasRealizadas;
    }
}