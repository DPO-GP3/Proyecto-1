package P1;

import java.util.ArrayList;
import java.util.List;

public class Subasta {
    private boolean enCurso;
    private List<Oferta> ofertas; 

    public Subasta() {
        this.enCurso = false;
        this.ofertas = new ArrayList<>();
    }

    public void iniciarSubasta() {
        this.enCurso = true;
        System.out.println("Subasta iniciada.");
    }

    public void finalizarSubasta() {
        this.enCurso = false;
        System.out.println("Subasta finalizada.");
    }

    
    public void registrarOferta(Comprador comprador, double monto) {
        Oferta nuevaOferta = new Oferta(comprador, monto);
        
        this.ofertas.add(nuevaOferta);
        
        System.out.println("Nueva oferta registrada: " + nuevaOferta);
    }
    
    public boolean estaEnCurso() {
        return enCurso;
    }

   
    public class Oferta {
        private Comprador comprador;
        private double monto;

        public Oferta(Comprador comprador, double monto) {
            this.comprador = comprador;
            this.monto = monto;
        }

        @Override
        public String toString() {
           
            return "Oferta de " + comprador.getNombre() + " por " + monto;
        }

       
        public Comprador getComprador() {
            return comprador;
        }

        public double getMonto() {
            return monto;
        }
    }
}


    
    
    
    
 

