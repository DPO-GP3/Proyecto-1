package P1;

import java.util.ArrayList;
import java.util.List;

public class Comprador {
    private String nombre;
    private double limiteCompra;
    private double saldo;
    private List<Subasta.Oferta> ofertasRealizadas; // Lista para mantener las ofertas realizadas por el comprador

    public Comprador(String nombre, double limiteCompra, double saldoInicial) {
        this.nombre = nombre;
        this.limiteCompra = limiteCompra;
        this.saldo = saldoInicial;
        this.ofertasRealizadas = new ArrayList<>();
    }

    public void realizarCompra(List<Pieza> piezas) {
        for (Pieza pieza : piezas) {
            if (this.saldo >= pieza.getPrecio()) {
                this.saldo -= pieza.getPrecio(); // Reducir saldo
                System.out.println("Compra realizada: " + pieza.getTitulo());
            } else {
                System.out.println("Fondos insuficientes para comprar: " + pieza.getTitulo());
            }
        }
    }

    public void realizarCompra(Pieza pieza) {
        double precio = pieza.getPrecio(); // Suponemos que hay un método getPrecio() en Pieza
        if (precio <= saldo) {
            saldo -= precio; // Disminuir el saldo por el precio de la pieza
            System.out.println("Compra realizada con éxito: " + pieza);
        } else {
            System.out.println("Saldo insuficiente para realizar la compra.");
        }
    }

    public String getNombre() {
        return nombre;
    }

    // Getters y setters para limiteCompra y saldo si son necesarios
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

    // Método para obtener la lista de ofertas realizadas
    public List<Subasta.Oferta> getOfertasRealizadas() {
        return ofertasRealizadas;
    }
}